# User-Authentication-SpringBoot

This project implements a user authentication system using **Spring Boot** and **PostgreSQL**. It provides basic functionality for user registration, password encryption, and role-based authentication. 

---

## Features
- User Registration
- Password Encryption (BCrypt)
- Role-Based Access Control
- Secure REST API Endpoints

---

## Prerequisites
Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
- **PostgreSQL**
- **Maven** (for dependency management)
- An IDE like IntelliJ IDEA or Eclipse

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/user-auth-system.git
cd user-auth-system
```

### 2. Configure Database

Create a PostgreSQL database and update the connection details in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build the Project
Use Maven to build the project:
```bash
mvn clean install
```

### 4. Run the Application
Run the Spring Boot application:
```bash
mvn spring-boot:run
```
The application will start at `http://localhost:8080`.

---

## API Endpoints

### 1. **Register a User**
**POST** `/auth/register`

**Request Body:**
```json
{
  "username": "testuser",
  "password": "password123",
  "role": "ROLE_USER"
}
```

**Response:**
```
User registered successfully
```

### 2. **Welcome Message (Secure Endpoint)**
**GET** `/auth/welcome`

**Response:**
```
Welcome to the secure area!
```

---

## Technologies Used

- **Spring Boot**: For backend development
- **PostgreSQL**: As the relational database
- **Spring Security**: For authentication and authorization
- **BCrypt**: For password encryption

---

## Folder Structure
```
user-auth-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.controller/  # REST API controllers
│   │   │   ├── com.example.model/       # Entity classes
│   │   │   ├── com.example.repository/  # Database repository interfaces
│   │   │   ├── com.example.security/    # Security configuration
│   │   ├── resources/
│   │       ├── application.properties  # Database configuration
├── pom.xml                              # Maven dependencies
```

---

## Future Enhancements

- Extend roles and permissions for more granular access control

---


---

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.

---

## Contact
For any queries, feel free to reach out:
- **Email:** pawan.reddipalli27@gmail.com
- **GitHub:** [pawan-reddipalli](https://github.com/pawanreddipalli)
