# Java-Employee-Inheritance-Project
A Java project demonstrating inheritance, method overriding, method overloading, and
unit testing. It models three kinds of workers: regular employees, part-time employees,
and external contractors.

## Overview

The project is built around an `Employee` base class with two subclasses:

| Class | Extends | Description |
|-------|---------|-------------|
| `Employee` | n/a | Represents a standard employee working 40 hours per week |
| `PartTimeEmployee` | `Employee` | Employee whose weekly pay depends on hours actually worked |
| `ExternalContractor` | `Employee` | Contractor paid hourly based on a customer rank |

## Concepts Demonstrated

- **Inheritance**: `PartTimeEmployee` and `ExternalContractor` extend `Employee` and
  reuse its constructor and getters via `super()`
- **Overriding**: `PartTimeEmployee.weeklyPay()` replaces the 40-hour calculation
  with `hours * hourlyRate`
- **Overloading**: `ExternalContractor` adds `getHourlyRate(char rank)` and
  `weeklyPay(int hours, char rank)` alongside the inherited versions
- **`equals()` implementation**: Two `Employee` objects are equal if they share the
  same name and employee ID
- **Unit testing**: Each class has a JUnit test class using the `student.TestCase`
  framework

## Project Structure
├── Employee.java
├── EmployeeTest.java
├── PartTimeEmployee.java
├── PartTimeEmployeeTest.java
├── ExternalContractor.java
└── ExternalContractorTest.java


## Contractor Pay Rates

| Customer Rank | Hourly Rate |
|---------------|-------------|
| A | $45.50 |
| B | $41.75 |
| C | $38.50 |
| Any other | $0.00 (invalid) |

## Running the Tests

The tests extend `student.TestCase`, so `student.jar` must be on your classpath.

1. Import the `.java` files into a Java project (Eclipse, IntelliJ, etc.)
2. Add `student.jar` to the project's build path
3. Run each `*Test.java` file as a JUnit test

## Example Usage

```java
Employee emp = new Employee("John", 360, 30.5);
emp.weeklyPay();                       // 1220.0

PartTimeEmployee pte = new PartTimeEmployee("Henry", 35, 25.0, 30);
pte.weeklyPay();                       // 750.0

ExternalContractor ec = new ExternalContractor("Alex", 50, 41.75);
ec.weeklyPay(40, 'B');                 // 1670.0
```
