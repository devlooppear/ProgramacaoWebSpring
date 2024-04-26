# Use the official OpenJDK image as a parent image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/*.jar /app/app.jar

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]
