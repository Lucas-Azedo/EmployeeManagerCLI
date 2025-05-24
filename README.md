# EmployeeManagerCLI

A simple REST API for employee management, built with Spring Boot.  
This project allows you to create, list, retrieve, update, and delete employees using standard HTTP methods (GET, POST, PUT, DELETE).

---

## Current Features

- **Create employee** (POST `/employees`): Adds a new employee with an auto-generated unique ID.
- **List employees** (GET `/employees`): Returns a list of all registered employees.
- **Get employee by ID** (GET `/employees/{id}`): Retrieves employee details by ID.
- **Update employee** (PUT `/employees/{id}`): Updates an existing employee's information.
- **Delete employee** (DELETE `/employees/{id}`): Removes the employee by ID.

Currently, data is stored in memory using a `HashMap` inside the `EmployeeService`. This means all data is lost when the application stops.

---

## Technologies Used

- Java 24
- Spring Boot (Web)
- Maven (dependency management and build)
- Java Collections Framework for in-memory data storage
- Postman for testing

---

## Future Improvements and Possibilities

- **Database persistence:**  
  Implement relational database support (e.g., H2, MySQL, PostgreSQL) using Spring Data JPA to persist data.

- **Improved error handling:**  
  Create custom exceptions (e.g., `EmployeeNotFoundException`) and use `@ControllerAdvice` for clean and meaningful HTTP error responses.

- **Input validation:**  
  Use validation annotations (`@Valid`, `@NotBlank`, `@Min`, etc.) to ensure incoming request data is valid.

- **DTOs for request and response:**  
  Avoid exposing the `Employee` entity directly. Use Data Transfer Objects (DTOs) for better API design and versioning.

- **Pagination and filtering:**  
  Add pagination support to handle large sets of employees efficiently.

- **Authentication and authorization:**  
  Integrate Spring Security to protect endpoints and manage access control.

- **API documentation:**  
  Add Swagger/OpenAPI for interactive API documentation.

- **Automated testing:**  
  Develop unit and integration tests to improve code quality and reliability.

---

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EmployeeManagerCLI.git
   cd EmployeeManagerCLI
