# 🐶 E-Commerce Veterinario Backend (Spring Boot)

[![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Este repositorio contiene la lógica del **backend** del sistema de e-commerce dedicado a productos y servicios veterinarios. Está desarrollado utilizando el framework **Spring Boot** para proporcionar una API REST robusta y escalable.

---

## 🚀 Características Principales

El backend está diseñado para manejar todas las operaciones esenciales de un e-commerce:

* **Gestión de Productos:** CRUD completo para productos, categorías y stock.
* **Gestión de Usuarios:** Autenticación (JWT/OAuth2) y autorización de roles (Cliente, Administrador).
* **Carrito de Compras y Pedidos:** Lógica de negocio para añadir productos, gestionar la cesta y procesar pedidos.
* **Integración de Pagos:** Preparado para integrarse con pasarelas de pago externas.
* **Servicios Veterinarios:** Módulos para gestionar citas y servicios especiales.

---

## 🛠️ Tecnologías Utilizadas

| Componente | Tecnología | Descripción |
| :--- | :--- | :--- |
| **Framework Principal** | **Spring Boot** (Java) | Base de la aplicación y microservicios. |
| **Persistencia** | **Spring Data JPA** | Abstracción para la gestión de la base de datos. |
| **Base de Datos** | PostgreSQL / MySQL (Configurable) | Almacenamiento de datos transaccionales. |
| **Seguridad** | **Spring Security** | Autenticación basada en tokens JWT. |
| **Documentación** | **OpenAPI / Swagger** | Documentación y pruebas interactivas de los endpoints. |

---

## ⚙️ Requisitos del Sistema

Para ejecutar este proyecto localmente, necesitarás tener instalado:

* **Java Development Kit (JDK):** Versión 17 o superior.
* **Maven** (o Gradle)
* Una instancia de **Base de Datos** (ej: PostgreSQL)

---

## 💻 Instalación y Ejecución Local

Sigue estos pasos para levantar el servidor backend en tu entorno de desarrollo:

### 1. Clonar el Repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
cd e-commerce-veterinario-backend
