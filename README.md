# To-Do List Backend 

A RESTful To-Do List Backend application built using Spring Boot, Spring Data JPA, MySQL, and Lombok. This project provides CRUD operations for managing tasks.

## Features

* Create a new task
* View all tasks
* View task by ID
* Update an existing task
* Delete a task
* MySQL database integration
* REST API architecture
* Lombok for reducing boilerplate code

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Lombok
* Maven

## Project Structure

src/main/java

├── controller

│ └── TodoController.java

├── entity

│ └── Todo.java

├── repository

│ └── TodoRepository.java

├── service

│ └── TodoService.java

└── TodoListApplication.java

## Database Configuration

Update the database credentials in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## API Endpoints

### Create Task

POST `/api/todos`

Request Body:

```json
{
  "title": "Learn Spring Boot",
  "description": "Complete CRUD Project",
  "completed": false
}
```

### Get All Tasks

GET `/api/todos`

### Get Task By ID

GET `/api/todos/{id}`

### Update Task

PUT `/api/todos/{id}`

Request Body:

```json
{
  "title": "Updated Task",
  "description": "Updated Description",
  "completed": true
}
```

### Delete Task

DELETE `/api/todos/{id}`

## Running the Project

1. Clone the repository.
2. Create a MySQL database named `todolist`.
3. Configure database credentials in `application.properties`.
4. Run the Spring Boot application.
5. Test APIs using Postman.
