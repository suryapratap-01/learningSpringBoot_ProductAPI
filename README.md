# 📦 Spring Boot REST API - Product Management

A simple RESTful API built with Spring Boot to manage products. This application supports basic CRUD operations (Create, Read, Update, Delete) on a `Product` entity.

---

## 🚀 Features

- Create a new product
- Get all products
- Get a product by ID
- Update an existing product
- Delete a product

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.learnSpring.RestAPI/
│   │       ├── Controller/
│   │       │   └── ProductController.java
│   │       ├── Entity/
│   │       │   └── Product.java
│   │       ├── Service/
│   │       │   └── ProductService.java
│   │       └── RestApiApplication.java
│   └── resources/
│       ├── application.properties
```

---

## ⚙️ Setup Instructions

### 1. Install Prerequisites

Make sure you have the following installed:

- [Java 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/) (for managing your database easily)

> 💡 **MySQL Workbench** is a GUI tool to interact with your database. Use it to create the database schema and inspect tables.

### 2. Create the Database

Use MySQL Workbench or MySQL CLI to create a database for the application:

```sql
CREATE DATABASE product_db;
```

### 3. Configure `application.properties`

In `src/main/resources/application.properties`, update the MySQL connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

> Replace `your_password` with your actual MySQL root password.

### 4. Clone the Repository

```bash
git clone https://github.com/your-username/springboot-rest-api.git
cd springboot-rest-api
```

### 5. Build the Project

```bash
mvn clean install
```

### 6. Run the Application

```bash
mvn spring-boot:run
```

The server will start at:  
👉 `http://localhost:8080`

---

## 🔄 API Endpoints

| Method | Endpoint               | Description          |
|--------|------------------------|----------------------|
| POST   | `/api/v1/product`      | Create a product     |
| GET    | `/api/v1/products`     | Get all products     |
| GET    | `/api/v1/products/{id}`| Get product by ID    |
| PUT    | `/api/v1/products/{id}`| Update product       |
| DELETE | `/api/v1/products/{id}`| Delete product       |

---

## 🧪 Sample Request

### POST `/api/v1/product`

```json
{
  "name": "Example Product",
  "price": 99.99,
  "quantity" : 100
}
```

---

## 📝 Notes

- You can use **Postman** or **curl** to test the API endpoints.
- Ensure MySQL Server is running before starting the application.
- MySQL Workbench is optional but highly recommended for visual database management.


---

## 🙋‍♂️ Questions?

Feel free to open an issue or reach out!
