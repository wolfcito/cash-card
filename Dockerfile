# image base with JDK 17 and Gradle
FROM gradle:8.3.0-jdk17 AS build

# workdirectory
WORKDIR /app

# copy all project to workdirectory
COPY . /app

# Clean and build
RUN gradle clean build

# Create new image based on jdk 17
FROM openjdk:17

# Expose application port
EXPOSE 8080

# Copy jar built
COPY --from=build /app/build/libs/cash-card-0.0.1-SNAPSHOT.jar /app/cash-card-0.0.1-SNAPSHOT.jar

# Establish entry point to execute this app
ENTRYPOINT ["java", "-jar", "/app/cash-card-0.0.1-SNAPSHOT.jar"]