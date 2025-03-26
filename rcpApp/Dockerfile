# Use official OpenJDK base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the WAR file
COPY build/libs/app.war /app/rcp.war

# Expose application port
EXPOSE 8080 5701

# Run the application
ENTRYPOINT ["java", "-jar", "/app/rcp.war"]
