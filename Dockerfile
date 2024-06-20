# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Install necessary libraries
RUN apt-get update && \
    apt-get install -y libx11-6 libgl1 libglib2.0-0 && \
    apt-get install -y maven

# Set the JAVA_HOME environment variable
ENV JAVA_HOME /usr/local/openjdk-17

# Set the working directory in the container
WORKDIR /app

# Copy the JavaFX SDK to the container
COPY library/javafx-sdk-22.0.1 /opt/javafx-sdk-22.0.1

# Copy the Maven project files to the container
COPY login/pom.xml ./
COPY login/src ./src

# Build the Maven project
RUN mvn clean package

# Copy the built JAR file to the container
COPY login/target/login-1.0-SNAPSHOT.jar /app/login-1.0-SNAPSHOT.jar

# Specify the entry point to run the built JAR file
CMD ["mvn", "javafx:run"]
