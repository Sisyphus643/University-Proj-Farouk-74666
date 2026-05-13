
# Spring Framework App – Project 1

## Author
Human74666

---

# Project Description

This project is a simple Spring Boot web application created using Java and Spring Framework.

The application demonstrates:
- creating a Spring Boot project,
- creating Spring controllers,
- handling HTTP GET requests,
- using the `@ResponseBody` annotation,
- returning Thymeleaf HTML views,
- basic MVC architecture.

The project was created in IntelliJ IDEA using Maven and Spring Boot.

---

# Technologies Used

- Java 17
- Spring Boot
- Maven
- Thymeleaf
- Spring Web MVC
- Lombok
- IntelliJ IDEA

---

# Project Structure

```text
src/main/java
 └── controller
      ├── HelloController.java
      └── TestController.java

src/main/resources
 ├── templates
 │    └── greeting.html
 └── application.properties
```

---

# How to Run the Project

## 1. Clone Repository

```bash
git clone YOUR_GITHUB_LINK
```

---

## 2. Open Project in IntelliJ IDEA

Open the project folder using IntelliJ IDEA.

---

## 3. Reload Maven

Right click project:

```text
Maven → Reload Project
```

---

## 4. Run Application

Run:

```text
DemoApplication.java
```

The application starts on:

```text
http://localhost:8080
```

---

# Endpoints

## GET /

Returns plain text response from the application.

### URL

```text
http://localhost:8080/
```

### Example Response

```text
Hey, it works! so happy i finally did so much procrastinating omg !
```

### Controller Code

```java
@GetMapping("/")
public String home() {
    return "Hey, it works! so happy i finally did so much procrastinating omg !";
}
```

---

## GET /test

This endpoint demonstrates the use of the `@ResponseBody` annotation.

### URL

```text
http://localhost:8080/test
```

### Example Response

```text
This uses @ResponseBody human 74666
```

### Controller Code

```java
@GetMapping("/test")
@ResponseBody
public String test() {
    return "This uses @ResponseBody human 74666";
}
```

---

## GET /greeting

Returns a Thymeleaf HTML page.

### URL

```text
http://localhost:8080/greeting
```

### HTML View

The application returns:

```text
greeting.html
```

stored in:

```text
src/main/resources/templates
```

### Example Page Content

```html
<h1>Hello from Thymeleaf by human74666!</h1>
```

---

# Explanation of @ResponseBody

The `@ResponseBody` annotation tells Spring Boot to return the method result directly as HTTP response content instead of returning an HTML template.

Example:

```java
@ResponseBody
public String test()
```

This sends plain text directly to the browser.

---

# MVC Pattern

The project uses the MVC (Model-View-Controller) pattern.

## Controller

Handles HTTP requests:

```text
HelloController.java
TestController.java
```

## View

HTML pages rendered using Thymeleaf:

```text
greeting.html
```

---

# Thymeleaf

Thymeleaf is used as the template engine for rendering HTML pages.

Templates are stored in:

```text
src/main/resources/templates
```

---

# Screenshots

## Application Running


```md
![Application](screenshots/application.png)
```

---

## Home Endpoint


```md
![Home](screenshots/home.png)
```

---

## Greeting Page


```md
![Greeting](screenshots/greeting.png)
```

---

## Console Output


```md
![Console](screenshots/console.png)
```

---

# Testing

The project was tested using:
- browser,
- localhost endpoints,
- Spring Boot server.

Tested endpoints:
- `/`
- `/test`
- `/greeting`

---

# Dependencies

Main dependencies used in `pom.xml`:

- Spring Boot Starter Web MVC
- Spring Boot Starter Thymeleaf
- Lombok

---

# Conclusion

This project demonstrates the basics of Spring Framework and Spring Boot:
- controllers,
- HTTP requests,
- `@ResponseBody`,
- Thymeleaf templates,
- MVC architecture,
- running a local web application.
