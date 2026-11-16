# Java Selenium Cucumber BDD Hybrid Automation Framework

An end-to-end UI test automation framework built using **Java**, **Selenium WebDriver**, **Cucumber BDD**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.

## Tech Stack & Tools
- **Language:** Core Java
- **Automation Tool:** Selenium WebDriver
- **BDD Framework:** Cucumber (Gherkin Feature Files, Step Definitions, Hooks)
- **Test Runner & Assertions:** TestNG & JUnit
- **Build & Dependency Management:** Maven (`pom.xml`)
- **Data-Driven Testing:** Apache POI (Excel Test Data)
- **Reporting:** Cucumber HTML/Extent Reports & Failure Screenshots

## Project Structure
- `Feature/` – Gherkin `.feature` files defining business scenarios
- `src/` – Page Object classes, Step Definitions, Hooks, and Base utilities
- `TestRunner/` – TestNG/Cucumber runner configurations
- `Config/` – Environment and browser configuration properties
- `TestData/` – External Excel test data files
- `Reports/` – Automated test execution reports
- `Screenshots/` – Captured screenshots for test validation and failure debugging
