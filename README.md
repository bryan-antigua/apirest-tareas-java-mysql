# Gestor de Tareas - Bryan.dev

Este es un proyecto backend desarrollado en **Java** utilizando el framework **Spring Boot**, con **MySQL** como base de datos y pruebas realizadas en **Postman**. El sistema permite gestionar tareas con funciones de agregar, actualizar, eliminar y visualizar la fecha de creación y actualización de cada una.

## Tecnologías utilizadas

- **Java**
- **Spring Boot**
- **MySQL**
- **Postman**

## Funcionalidades

- Crear una nueva tarea
- Actualizar una tarea existente
- Eliminar una tarea
- Ver detalles de una tarea
  - Fecha de creación
  - Fecha de última actualización

## Estructura del proyecto

- Controladores REST para manejar las solicitudes HTTP
- Servicios para la lógica de negocio
- Repositorios para la conexión con la base de datos MySQL
- Entidades que representan las tareas

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/BryanAntigua/gestor-tareas.git

2. Configura tu base de datos MySQL y actualiza el archivo application.properties o application.yml con tus credenciales.


3. Ejecuta el proyecto con tu IDE o desde la terminal con:

./mvnw spring-boot:run



Uso

Puedes usar Postman para probar los endpoints REST:

POST /tareas - Crear nueva tarea

PUT /tareas/{id} - Actualizar tarea existente

DELETE /tareas/{id} - Eliminar tarea

GET /tareas/{id} - Ver detalles de una tarea (incluye fechas)


Autor

Bryan.dev
