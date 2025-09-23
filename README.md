# 🚀 Spring Boot Microservices Project

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-brightgreen)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2025-green)
![Netflix Eureka](https://img.shields.io/badge/Service%20Discovery-Eureka-orange)
![Gateway](https://img.shields.io/badge/API%20Gateway-Spring%20Cloud-yellow)
![License](https://img.shields.io/badge/License-MIT-red)

---

## 📌 Introduction

This is a **Spring Boot Microservices project** built using **Spring Cloud**.  
It demonstrates how multiple microservices can communicate with each other via **Eureka Discovery Server** and **Spring Cloud Gateway**.

The project contains:
- ✅ **Eureka Discovery Server** for service registry
- ✅ **API Gateway** for routing and load balancing
- ✅ **User Service** (CRUD operations for users)
- ✅ **Order Service** (CRUD operations for orders)
- ✅ **H2 Database** for persistence

---

## ✨ Features

- 🔍 **Service Discovery** (Eureka Server)
- 🔄 **Load Balancing** via Gateway
- 🔑 **Centralized Routing** through API Gateway
- 📊 **Database Integration** with JPA + H2
- 🛠️ **Easy to scale** — plug in new services quickly
- ⚡ **Fast development** with hot reload


---

## ⚙️ Tech Stack

- ✅ Java 17

- ✅ Spring Boot 3.5.6

- ✅ Cloud Netflix Eureka

- ✅ Spring Cloud Gateway

- ✅ Spring Data JPA + H2

- ✅ Maven

---
## 🏗️ Microservices Architecture

```bash
spring-microservices/
│── discovery-server   # Eureka Server (Service Registry)
│── api-gateway        # API Gateway (Routing + Load Balancing)
│── user-service       # User Management Microservice
│── order-service      # Order Management Microservice
│── pom.xml            # Parent POM

## 🏗️ Architecture


                        +------------------+
                        |  Discovery       |
                        |  Server (8761)   |
                        +------------------+
                                 |
    +------------------+         |        +------------------+
    |  User Service    | <------ | -----> |  Order Service   |
    |  (8081)          |                  |  (8082)          |
    +------------------+                  +------------------+
                                 |
                        +------------------+
                        |  API Gateway     |
                        |  (8080)          |
                        +------------------+

