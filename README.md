# Student Database Management System

A simple Java console-based application to manage student records using JDBC and PostgreSQL.

---

## Features

- Insert new student records (Name, Email, Age)
- View all student records
- Command-line interface

---

## Technologies Used

- Java (JDK 21+)
- PostgreSQL
- JDBC (Java Database Connectivity)
- Maven

---

## Dependencies

- PostgreSQL JDBC Driver
```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.5</version>
</dependency>

```
---

## Output

<img width="774" height="680" alt="output1 (1)" src="https://github.com/user-attachments/assets/aa5b3397-f9af-4b94-85f6-3652f58e3c3a" />

---

## Prerequisites
Java must be installed (JDK 21 or higher)

PostgreSQL should be installed and running

Database and table should be created before running the application
Example table:
```
CREATE TABLE std (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);


```
---

## contact
- your name: Ishant Teli
- Email: ishantteli27@gmail.com
- GitHub: Ishant9309
