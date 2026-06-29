# SpringBoot_Day4

A collection of Spring Framework and Spring Boot projects created while learning core Spring concepts, RESTful web services, client-server communication, and API documentation using Swagger/OpenAPI.

---

## 📚 Projects Included

### 1. Spring
- Introduction to Spring Framework
- Bean Creation
- Dependency Injection (DI)
- Inversion of Control (IoC)
- XML-based Configuration

---

### 2. OnlySpring
- Core Spring examples
- Bean management
- Constructor Injection
- Setter Injection
- Spring Container

---

### 3. ProductService
A Spring Boot REST API that provides product-related services.

#### Features
- REST APIs
- CRUD Operations
- Spring MVC
- Spring Data JPA
- Exception Handling
- JSON Response

---

### 4. ProductClient
Client application that consumes ProductService APIs.

#### Features
- REST Client
- HTTP Request Handling
- API Consumption
- Integration with ProductService

---

### 5. SwaggerLearning
Demonstrates API documentation using Swagger/OpenAPI.

#### Features
- Swagger UI
- OpenAPI Documentation
- Interactive API Testing
- Auto-generated API Documentation

---

# Technologies Used

- Java
- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data JPA
- Maven
- Swagger / OpenAPI
- REST APIs

---

# Project Structure

```
SpringBoot_Day4
│
├── OnlySpring
├── ProductClient
├── ProductService
├── Spring
└── SwaggerLearning
```

---

# Prerequisites

- Java 17 or above
- Maven
- Eclipse / IntelliJ IDEA / VS Code
- Postman (for testing APIs)

---

# How to Run

### Clone the repository

```bash
git clone https://github.com/jarvis-00001/SpringBoot_Day4.git
```

### Navigate to the project

```bash
cd SpringBoot_Day4
```

### Open any project

Import the desired project as a Maven Project.

### Build

```bash
mvn clean install
```

### Run

Run the Spring Boot application's main class.

---

# API Documentation

For the **SwaggerLearning** project, once the application starts, open:

```
http://localhost:8080/swagger-ui/index.html
```

or

```
http://localhost:8080/swagger-ui.html
```

*(Depending on the Springdoc/Swagger version.)*

---

# Learning Outcomes

This repository demonstrates:

- Spring IoC Container
- Dependency Injection
- Bean Configuration
- Spring Boot Basics
- REST API Development
- Client-Server Communication
- API Documentation using Swagger
- Maven Project Structure

---

# Future Improvements

- Database Integration
- Authentication & Authorization
- Validation
- Logging
- Unit Testing
- Docker Support

---
