#!/bin/bash

cd ../databases

read -s -p "Enter DB Password for USER Root: " DB_PASSWORD
echo

# Save the credentials in db_secrets.env

echo "DB_PASSWORD=$DB_PASSWORD" > db_secrets.env

# Stop and remove any existing container if it exists
docker stop userlogin-db-container 2>/dev/null || true
docker rm userlogin-db-container 2>/dev/null || true

# Create secret files from the environment variables file
source db_secrets.env

cd ../Secrets
# Write secrets to files

echo -n $DB_PASSWORD > db_password.txt

#docker swarm leave --force

# docker swarm init
docker swarm init 2>/dev/null || true



if ! docker secret ls | grep -q db_password; then
    docker secret create db_password db_password.txt
else
    echo "Secret db_password already exists"
fi

cd ../databases

# Build the Docker image
docker build -t userlogin-db -f Dockerfile-db .

# Initialize Docker Swarm if not already initialized
# docker swarm init 2>/dev/null || true

# Remove the stack if it already exists to avoid conflicts
docker stack rm DB-stack

sleep 10

# Replace placeholders in the SQL file with actual values


# Copy the modified SQL file to the correct location
# cp init_tmp.sql ../docker-entrypoint-initdb.d/init.sql
# Remove any existing network to avoid network not found error
docker network rm DB-stack_default 2>/dev/null || true

# Deploy the stack using Docker Compose
docker stack deploy -c ../Containers/docker-compose.yml DB-stack

# Wait for the database to initialize
sleep 10 # Don't remove because its really important.



cd ../login
mvn clean package

mvn javafx:run

# Stop the docker swarm
docker stack rm DB-stack

# Clean up docker secrets


# Cleanup secrets files
rm ../Secrets/db_password.txt
rm ../databases/init_tmp.sql