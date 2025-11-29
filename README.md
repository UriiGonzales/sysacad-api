# SysAcad API - Sistema de Gestión Académica

API RESTful desarrollada para la gestión de alumnos, materias y notas, simulando el sistema académico de la UTN. Este proyecto implementa una arquitectura profesional de backend utilizando **Java 17**, **Spring Boot 3** y contenedores **Docker**.

## Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3 (Web, Data JPA, Validation)
* **Base de Datos:** MySQL 8.0 (Contenerizada)
* **Infraestructura:** Docker & Docker Compose
* **Documentación:** OpenAPI (Swagger UI)
* **Gestor de Dependencias:** Gradle

## Funcionalidades Principales

 **CRUD de Alumnos:** Alta, Baja, Modificación y Consulta.
 **Manejo de Errores Global:** Respuestas HTTP personalizadas (409 Conflict, 400 Bad Request) usando `@ControllerAdvice`.
 **Validaciones:** Control de integridad de datos (Email válido, campos obligatorios) con Jakarta Validation.
 **Documentación Automática:** Interfaz visual para probar la API con Swagger.

## Cómo ejecutar el proyecto

### Prerrequisitos
* Java 17 o superior
* Docker Desktop

### Paso a paso

1.  **Clonar el repositorio**
    ```bash
    git clone [https://github.com/UriiGonzales/sysacad-api.git](https://github.com/UriiGonzales/sysacad-api.git)
    cd sysacad-api
    ```

2.  **Levantar la Base de Datos (Docker)**
    ```bash
    docker-compose up -d
    ```

3.  **Ejecutar la Aplicación**
    ```bash
    ./gradlew bootRun
    ```

4.  **¡Listo!**
    * Prueba la API en: `http://localhost:8080/swagger-ui/index.html`

## Pruebas (Endpoints de ejemplo)

Puedes importar la colección de Postman o probar directamente:

* **Crear Alumno (POST):** `/api/students`
* **Listar Alumnos (GET):** `/api/students`

---
*Desarrollado por Uriel Gonzales - Estudiante de Ingeniería en Sistemas UTN FRM*
