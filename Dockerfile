# Use an official OpenJDK runtime as a parent image
FROM adoptopenjdk:17-jdk-hotspot

# Install necessary libraries
RUN apt-get update && \
    apt-get install -y libx11-6 libgl1 libglib2.0-0 libgtk-3-0 libcanberra-gtk-module && \
    apt-get install -y maven

# Set the JAVA_HOME environment variable
ENV JAVA_HOME /opt/java/openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the JavaFX SDK to the container
COPY library/javafx-sdk-22.0.1 /opt/javafx-sdk-22.0.1

# Set JavaFX environment variables
ENV PATH=$PATH:/opt/javafx-sdk-22.0.1/bin
ENV JAVA_OPTS="-Djava.library.path=/opt/javafx-sdk-22.0.1/lib"

# Copy the Maven project files to the container
COPY login/pom.xml ./
COPY login/src ./src

# Build the Maven project
RUN mvn clean package

# Copy the built JAR file to the container
COPY login/target/login-1.0-SNAPSHOT.jar /app/login-1.0-SNAPSHOT.jar

# Specify the entry point to run the built JAR file
CMD ["java", "--module-path", "/opt/javafx-sdk-22.0.1/lib", "--add-modules", "javafx.controls,javafx.fxml", "-Djava.library.path=/opt/javafx-sdk-22.0.1/lib", "-jar", "login-1.0-SNAPSHOT.jar"]
