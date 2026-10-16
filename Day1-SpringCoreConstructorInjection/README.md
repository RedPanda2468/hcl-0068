# Day 1 — Spring Core Constructor Injection

A Java Maven application demonstrating constructor-based dependency injection with Spring Core. This project does not use Spring Boot or XML configuration.

## Project structure

```text
Day1-SpringCoreConstructorInjection/
├── pom.xml
├── README.md
└── src/
    └── main/java/com/example/springcore/
        ├── Course.java
        ├── Student.java
        ├── StudentService.java
        ├── AppConfig.java
        └── MainApp.java
```

## Requirements

- JDK 17 or later
- Apache Maven

## Compile

From this directory, run:

```bash
mvn clean compile
```

Run `com.example.springcore.MainApp` from VS Code or another Java IDE with Maven project support.

## Expected console output

```text
Student ID: 101
Student Name: Aditi Sharma
Course ID: C01
Course Name: Java Full Stack
Duration: 4 months
```

## Constructor injection explanation

Constructor injection supplies an object's required dependencies through its constructor. The `Student` constructor receives a `Course` object, while `StudentService` receives a `Student` object.

The `AppConfig` class uses `@Configuration` and `@Bean` methods to register the `Course`, `Student`, and `StudentService` beans. Spring resolves dependencies through the parameters of these bean methods.

`AnnotationConfigApplicationContext` initializes the Spring container from `AppConfig.class`. `MainApp` retrieves `StudentService` using `context.getBean(StudentService.class)`, calls `displayStudentProfile()`, and closes the context.

## Screenshot

Add a screenshot of the application's console output here when preparing the final submission.
