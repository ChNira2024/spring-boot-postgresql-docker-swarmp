# Use OpenJDK 17 slim (works with Java 17)
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside the container
WORKDIR /app

# Copy your Spring Boot jar from target folder
COPY target/*.jar spboot-postgresql-docker-swarmp.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "spboot-postgresql-docker-swarmp.jar"]
