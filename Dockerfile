# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files to the container
COPY login/pom.xml ./
COPY login/src ./src

# Build the Maven project
RUN mvn clean package

# Copy the built JAR file to the container
COPY login/target/login-1.0-SNAPSHOT.jar /app/login-1.0-SNAPSHOT.jar

# Specify the entry point to run the built JAR file
CMD ["java", "-jar", "login-1.0-SNAPSHOT.jar"]
