# CLI-Banking System

A simple **Command-Line Interface (CLI)** based banking system implemented in Java. This system simulates basic banking operations such as deposit, withdrawal, credit card management, and loan eligibility based on credit score.

---

## Learning Objective

This project is created as a hands-on exercise to **understand and apply Object-Oriented Programming (OOP)** concepts in Java, such as:

- Classes & Objects
- Inheritance
- Encapsulation
- Abstraction
- Method Overriding

---

## Project Structure

The project is composed of four main classes:

### 1. `UserInfo` (Class 1)
- **Attributes**:
  - `name`
  - `accountNumber`
  - `currentBalance`
- **Methods**:
  - `displayBalance()`

### 2. `Transaction` (Class 2)
- **Inherits**: `UserInfo`
- **Methods**:
  - `deposit(amount)`
  - `withdraw(amount)`

### 3. `CreditCard` (Class 3)
- **Attributes**:
  - `hasCreditCard` (boolean)
  - `creditScore`

### 4. `Loan` (Class 4)
- **Attributes**:
  - `loanAmount`
- **Logic**:
  - If `creditScore` exceeds a certain threshold, loan is approved

---

## Flow Overview

```text
+--------+       +------------+       +--------------+
| BANK   |-----> | UserInfo   |<------| Transaction  |
+--------+       +------------+       +--------------+
                      |
                      v
               +--------------+
               | CreditCard   |
               +--------------+
                      |
                      v
               +--------------+
               | Loan         |
               +--------------+
