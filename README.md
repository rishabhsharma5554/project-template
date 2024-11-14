# RishabhTech Spring Boot Project

This project is a Spring Boot-based application developed by RishabhTech, utilizing various Spring ecosystem tools and libraries, including Spring Boot, Spring Cloud, Liquibase, and Spring Boot Admin. The application also includes OpenAPI documentation and H2 database support for development and testing purposes.

## Features

- **Spring Boot 3.3.5**: The core framework for building the application.
- **Spring Cloud 2023.0.3**: Provides Cloud-native features such as service discovery and circuit breakers.
- **Spring Boot Admin**: To monitor and manage Spring Boot applications.
- **Liquibase**: Database versioning and migrations.
- **Springdoc OpenAPI**: Auto-generates OpenAPI documentation for REST APIs.
- **FeiGN**: For client-side HTTP communication with services.
- **H2 Database**: Used for in-memory testing and development.
- **JUnit**: For running unit tests with JUnit platform.

## Requirements

- Java 23 or higher
- Gradle 7.x or higher

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/rishabhtech/spring-boot-project.git
    ```

2. Navigate to the project directory:
    ```bash
    cd spring-boot-project
    ```

3. Build the project using Gradle:
    ```bash
    ./gradlew build
    ```

4. Run the application:
    ```bash
    ./gradlew bootRun
    ```

5. The application will run on `http://localhost:8080`.

## Dependencies

- **Spring Boot Starter Web**: Basic web capabilities for the application.
- **Spring Boot Starter Data JPA**: For JPA-based persistence.
- **Spring Boot Starter Actuator**: For production-ready features like health checks.
- **Spring Cloud Starter OpenFeign**: Simplifies HTTP communication with microservices.
- **Spring Boot Admin**: For monitoring and management.
- **Liquibase**: For database migration management.
- **Springdoc OpenAPI**: For generating OpenAPI specifications.

## Development Tools

- **Spring Boot DevTools**: Provides hot reloading during development.
- **Spotless Plugin**: Enforces consistent Java formatting (Google Java Format).

## Testing

To run the tests, use the following command:
```bash
./gradlew test
