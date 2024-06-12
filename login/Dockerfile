# Stage 1: Build the application
FROM maven:3.8.1-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and the source code
COPY pom.xml /app
COPY src /app/src

# Package the application
RUN mvn clean package

# Stage 2: Create the runtime image
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/login-1.0-SNAPSHOT.jar /app/login.jar

# Set the entry point to run the JAR file
CMD ["java", "-jar", "/app/login.jar"]
