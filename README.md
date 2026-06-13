# Playwright Java UI Automation

## Overview

This project is a UI test automation framework built using:

- Java 21
- Playwright
- Maven
- Cucumber BDD
- TestNG
- Page Object Model (POM)

The framework automates a sample customer support website created as part of a SheCodes HTML project.

## Technologies

- Playwright
- Java
- Maven
- Cucumber
- TestNG
- Git
- GitHub

## Test Scenarios

### Homepage

- Verify page title

### Login

- Verify user can login with valid credentials
- Verify password length validation
- Verify empty username/password validation

### Support Form

- Verify support request submission
- Verify required field validation
- Verify fields are cleared after successful submission

## Project Structure

```text
playwright-java-ui-automation
├── docs
│   └── index.html
├── src
│   └── test
│       ├── java
│       │   ├── pages
│       │   ├── runners
│       │   ├── step_definitions
│       │   └── utilities
│       └── resources
│           ├── features
│           └── config.properties
├── test-website
│   └── index.html
├── pom.xml
└── README.md
```

## Run Tests

Run all tests:

```bash
mvn test
```

Run Login tests:

```java
tags = "@login"
```

Run Support tests:

```java
tags = "@support"
```

Run Smoke tests:

```java
tags = "@smoke"
```

## Test Website

GitHub Pages URL:

https://maya-tester-eng.github.io/playwright-java-ui-automation/

## Author

Automation Framework created by:

**Musabekhon Ishanova / Maya**

QA Automation Engineer (Portfolio Project)
