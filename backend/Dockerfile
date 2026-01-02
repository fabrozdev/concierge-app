FROM amazoncorretto:25-alpine-jdk
LABEL authors="fabroz.dev"

# Create directory for the app
WORKDIR /app

# Copy everything from the current folder to the app directory
COPY . .

# Build the app skipping the tests
RUN ./mvnw clean package -DskipTests

# Expose the app
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "./target/app-0.0.1-SNAPSHOT.jar"]
