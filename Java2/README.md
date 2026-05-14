# Task 2P - Spring Boot REST API

## Author
Farouk Shehata

## Project Description

This project is a Spring Boot REST API application for managing products.

The application demonstrates:

- creating a REST API using Spring Boot,
- using HTTP methods: `POST`, `GET`, `PUT`, and `DELETE`,
- working with JSON request and response bodies,
- using service, repository, domain, support, request, and response layers,
- using Spring Data JPA,
- using the H2 in-memory database,
- handling exceptions correctly,
- testing endpoints with Postman or Swagger UI.

---

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Swagger / OpenAPI
- IntelliJ IDEA

---

## Project Structure

```text
src/main/java/com/farouk/task2p
 ├── api
 │   ├── ProductController.java
 │   ├── request
 │   │   ├── ProductRequest.java
 │   │   └── UpdateProductRequest.java
 │   └── response
 │       └── ProductResponse.java
 ├── domain
 │   └── Product.java
 ├── repository
 │   └── ProductRepository.java
 ├── service
 │   └── ProductService.java
 ├── support
 │   ├── ProductMapper.java
 │   ├── ProductExceptionHandler.java
 │   └── exception
 │       └── ProductNotFoundException.java
 ├── shared
 │   └── api
 │       └── response
 │           └── ErrorMessageResponse.java
 └── Task2PApplication.java
```

---

## How to Run the Project

### 1. Clone the Repository

```bash
git clone YOUR_GITHUB_LINK
```

### 2. Open the Project

Open the project in IntelliJ IDEA.

### 3. Reload Maven

Right-click the project and choose:

```text
Maven -> Reload Project
```

### 4. Run the Application

Run the main class:

```text
Task2PApplication.java
```

The application starts on:

```text
http://localhost:8080
```

---

## Swagger UI

Swagger UI can be opened in the browser:

```text
http://localhost:8080/swagger-ui/index.html
```

Swagger allows testing all API endpoints directly from the browser.

---

## H2 Database Console

The H2 database console can be opened in the browser:

```text
http://localhost:8080/console
```

Use this JDBC URL:

```text
jdbc:h2:mem:testdb
```

Default username:

```text
sa
```

Password is empty.

---

## API Endpoints

Base URL:

```text
http://localhost:8080/api/v1/products
```

---

## 1. Create Product

### Method

```text
POST
```

### URL

```text
/api/v1/products
```

### Request Body

```json
{
  "name": "Tennis Ball",
  "price": 5.99
}
```

### Example Response

```json
{
  "id": 1,
  "name": "Tennis Ball",
  "price": 5.99
}
```

### Status Code

```text
201 Created
```

---

## 2. Get Product by ID

### Method

```text
GET
```

### URL

```text
/api/v1/products/1
```

### Example Response

```json
{
  "id": 1,
  "name": "Tennis Ball",
  "price": 5.99
}
```

### Status Code

```text
200 OK
```

---

## 3. Get All Products

### Method

```text
GET
```

### URL

```text
/api/v1/products
```

### Example Response

```json
[
  {
    "id": 1,
    "name": "Tennis Ball",
    "price": 5.99
  }
]
```

### Status Code

```text
200 OK
```

---

## 4. Search Products by Name

### Method

```text
GET
```

### URL

```text
/api/v1/products/search?name=ball
```

### Example Response

```json
[
  {
    "id": 1,
    "name": "Tennis Ball",
    "price": 5.99
  }
]
```

### Status Code

```text
200 OK
```

---

## 5. Update Product

### Method

```text
PUT
```

### URL

```text
/api/v1/products/1
```

### Request Body

```json
{
  "name": "Football",
  "price": 15.50
}
```

### Example Response

```json
{
  "id": 1,
  "name": "Football",
  "price": 15.50
}
```

### Status Code

```text
200 OK
```

---

## 6. Delete Product

### Method

```text
DELETE
```

### URL

```text
/api/v1/products/1
```

### Status Code

```text
204 No Content
```

---

## Exception Handling

If the user tries to find, update, or delete a product that does not exist, the application returns a `404 Not Found` response.

Example:

```text
GET /api/v1/products/999
```

Example response:

```json
{
  "message": "Product with id 999 was not found"
}
```

---

## Screenshots


Then add them below:

### Swagger UI

![Swagger UI](screenshots/swagger.png)

### Create Product in Postman

![Create Product](screenshots/postman-create.png)

### H2 Console

![H2 Console](screenshots/h2-console.png)

### Products Table

![Products Table](screenshots/database-products.png)

---

## What Was Fixed

The project was cleaned and improved by:

- renaming incorrect packages from `serivice` to `service`,
- renaming incorrect package `respiratory` to `repository`,
- replacing the manual list repository with Spring Data JPA,
- converting `Product` into a database entity,
- adding POST create endpoint,
- adding GET by id endpoint,
- adding GET all endpoint,
- keeping search by name endpoint,
- adding PUT update endpoint,
- adding DELETE endpoint,
- adding H2 database configuration,
- adding exception handling,
- adding this README file.

---

## Conclusion

This project demonstrates a complete basic Spring Boot REST API with CRUD operations, database support, exception handling, and API testing support through Swagger or Postman.
