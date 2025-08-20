# 📝 Blog-App (Spring Boot + MySQL)

A simple **Blog Management Application** built using **Spring Boot, Spring Data JPA, and MySQL**.  
It demonstrates a clean architecture with CRUD APIs, DTOs and validation.

---

## ✨ Features
- Create, update, delete, and view blog posts  
- Categories & comments support  
- Pagination & search APIs   

---

## 🛠️ Tech Stack
- **Backend:** Spring Boot 3.x, Java 17+  
- **Database:** MySQL / H2 (for tests)  
- **Build Tool:** Maven  

---

## 🚀 Getting Started

```bash
# Clone repo
git clone https://github.com/shubhwithst/Blog-App.git
cd Blog-App

# Configure DB in src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_DB-Name
spring.datasource.username=root
spring.datasource.password=root

# Run app
./mvnw spring-boot:run
