
# 🏥 ConMed API – Medical Appointments Backend

**ConMed API** is the backend service of a full-stack web application for managing medical appointments, patient records, and other healthcare-related workflows. This service is built using **Spring Boot** and provides a RESTful API for the frontend, which is being developed in **ReactJS**.

---

## 📌 Features

- ✅ Patient CRUD operations
- ✅ DTO-based request/response mapping
- ✅ MapStruct for clean and maintainable mapping logic
- ✅ JPA & PostgreSQL integration
- ✅ RESTful architecture
- ✅ Transactional service layer
- ✅ Easily extensible for doctors, appointments, users, etc.

---

## 🧱 Tech Stack

| Layer         | Technology            |
|---------------|------------------------|
| Language      | Java 21                |
| Framework     | Spring Boot 3.3.x      |
| Data Access   | Spring Data JPA        |
| Database      | PostgreSQL             |
| Mapping       | MapStruct              |
| Dependency Mgmt | Maven                |
| Build Tool    | Spring Boot Maven Plugin |
| Dev Tools     | Spring DevTools        |


---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven 3.8+
- PostgreSQL 12+
- (Optional) Docker & Docker Compose

---

### 🛠️ Setup Instructions

1. **Clone the repo**
   ```bash
   git clone https://github.com/wporta/conmed-api.git
   cd conmed-api
   ```

2. **Configure the Database**

   Update `src/main/resources/application.properties`:

```properties
spring.application.name=conmed-api

# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/conmed
spring.datasource.username=user
spring.datasource.password=password
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate/JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

# Connection pool settings (HikariCP is the default in Spring Boot)
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.maximum-pool-size=10
```

3. **Build and Run**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## 🔧 Development Notes

- **DTOs** are used to decouple persistence entities from exposed data.
- **MapStruct** is used for clean and fast mapping between DTOs and entities.
- **Lombok** simplifies boilerplate (getters, setters, constructors, etc.).
- **Transactional** service methods ensure consistency.

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to fork this repository and open a pull request.

---

## 📝 License

This project is licensed under the MIT License.  
See [LICENSE](LICENSE) for more information.

---

## 👨‍💻 Author

Developed with ❤️ by **Wilfredo Porta**  
[GitHub](https://github.com/wporta)
