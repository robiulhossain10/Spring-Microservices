# 🚀 Spring Boot Microservices Project

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-brightgreen)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2025-green)
![Netflix Eureka](https://img.shields.io/badge/Service%20Discovery-Eureka-orange)
![API Gateway](https://img.shields.io/badge/API%20Gateway-Spring%20Cloud-yellow)
![Config Server](https://img.shields.io/badge/Config%20Server-Spring%20Cloud-blueviolet)
![H2 Database](https://img.shields.io/badge/Database-H2-lightgrey)
![License](https://img.shields.io/badge/License-MIT-red)


---

## 📌 Introduction

This is a **Spring Boot Microservices project** built using **Spring Cloud**.  
It demonstrates how multiple microservices can communicate with each other via **Eureka Discovery Server** and **Spring Cloud Gateway**.

## 🗂️ The Project Contains

- ✅ **Eureka Discovery Server** – registers and discovers all microservices
- ✅ **API Gateway** – handles centralized routing and load balancing
- ✅ **User Service** – performs CRUD operations for user data
- ✅ **Order Service** – performs CRUD operations for order data
- ✅ **H2 Database** – in-memory database for persistence during development
- ✅ **Spring Cloud Config** – centralized configuration management for all services
- ✅ **Spring Boot Actuator** – monitoring and health endpoints for services


---

## ✨ Features

- 🔍 **Service Discovery** via **Eureka Server**
- 🔄 **Load Balancing** through Gateway
- 🔑 **Centralized Routing** via API Gateway
- 📊 **Database Integration** with **JPA + H2**
- 🛠️ **Easy to scale** — quickly plug in new microservices
- ⚡ **Fast development** with hot reload
- 💾 **Centralized Configuration** with Spring Cloud Config
- 📈 **Health Monitoring** using Spring Boot Actuator
- 🧩 **Microservice Architecture** for modular development



---

## ⚙️ Tech Stack

- ✅ Java 17

- ✅ Spring Boot 3.5.6

- ✅ Spring Cloud Config

- ✅ REST API

- ✅ Cloud Netflix Eureka

- ✅ Spring Cloud Gateway

- ✅ Spring Data JPA + H2

- ✅ Maven

---
## 🏗️ Microservices Architecture

```bash
spring-microservices/
│── discovery-server # 🔹 Eureka Server (Service Registry)
│── api-gateway # 🔹 API Gateway (Routing + Load Balancing)
│── user-service # 🔹 User Management Microservice (CRUD + H2 DB)
│── order-service # 🔹 Order Management Microservice (CRUD + H2 DB)
│── config-server # 🔹 Spring Cloud Config Server (Centralized Config)
│── config-repo # 🔹 Local/Remote repository for YAML configurations
│── pom.xml # 🔹 Parent POM for dependency management

## 🏗️ Architecture

                           +------------------+
                           |  Discovery       |
                           |  Server (8761)   |
                           +------------------+
                                     |
             +-----------+-----------+-----------+
             |           |                       |
     +------------------+               +------------------+
     |  User Service    |               |  Order Service   |
     |  (8081)          |               |  (8082)          |
     +------------------+               +------------------+
             |
     +------------------+
     | Product Service  |
     |  (8083)          |
     +------------------+
                                     |
                           +------------------+
                           |  API Gateway     |
                           |  (8080)          |
                           +------------------+
                                     |
                           +------------------+
                           |  Config Server   |
                           |  (8888)          |
                           +------------------+
                                     |
                           +------------------+
                           |  Admin Server    |
                           |  (8090)          |
                           +------------------+

