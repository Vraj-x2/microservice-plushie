
# Microservice - Plushie Entity Management

This project is a Spring Boot microservice that manages Plushie items sold by Police employees.  
It is part of a multi-microservice system connected through a Gateway application.

## 📚 Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Maven

## ⚙️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Vraj-x2/microservice-plushie.git
   ```

2. Navigate into the project directory:
   ```bash
   cd microservice-plushie
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   or, if you are using Windows:
   ```bash
   mvnw spring-boot:run
   ```

4. The service will start on:
   ```
   http://localhost:8082
   ```

## 🌐 REST API Endpoints

| Method | Endpoint | Description |
|:------|:---------|:------------|
| GET | `/api/plushies` | Retrieve all plushie items |
| GET | `/api/plushies/{id}` | Retrieve a specific plushie by ID |
| POST | `/api/plushies` | Create a new plushie item |
| PUT | `/api/plushies/{id}` | Update a plushie item |
| DELETE | `/api/plushies/{id}` | Delete a plushie item |

## 🗄️ Database Information

- **Database**: H2 In-Memory Database
- **URL**: `http://localhost:8082/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: _(empty)_

## 📌 Notes

- Bootstrap class initializes 10 Plushie entities on startup.
- This microservice connects to a Gateway application.

---

## 🚀 Author

[Vraj Contractor](https://github.com/Vraj-x2)
