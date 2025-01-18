**OVERVIEW**

ToDoApp is a web-based application built using Spring Boot, Thymeleaf, and Bootstrap. The application allows users to manage a list of tasks through functionalities such as adding new tasks, deleting tasks, and toggling the completion status of tasks.

**FEATURES**

Add Task: Users can add new tasks to their to-do list.

Delete Task: Users can delete tasks from their to-do list.

Toggle Task: Users can mark tasks as completed or incomplete.

**TECHNOLOGIES USED**

Spring Boot: Backend framework used for developing the RESTful APIs and business logic.

Thymeleaf: Template engine used for rendering the HTML views.

Bootstrap: CSS framework used for responsive design and styling.

**PREREQUISITES:**
Java 11 or higher
Maven
MySQL (or any other supported database)


**INSTALLATION:**
Clone the repository:
git clone https://github.com/yourusername/ToDoApp.git
cd ToDoApp
Set up the database:
Create a MySQL database named todoapp.\

*Update the application.properties file with your database username and password:*
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

*Build the project:*

mvn clean install

Run the application:

mvn spring-boot:run

**USAGE**

*Home Page:*
The home page displays the list of tasks.
Users can add new tasks using the input form.

*Add Task:*
Enter the task description and click the "Add" button to add a new task.

*Delete Task:*
Click the "Delete" button next to a task to remove it from the list.

*Toggle Task:*
Click the "Toggle" button to mark a task as completed or incomplete.

**PROJECT STRUCTURE**
*src/main/java* : Contains the Java source code.
*com.example.todoapp* : Main package containing the application code.
*controller* : Contains the controllers for handling web requests.
*model* : Contains the entity classes representing the data model.
*repository* : Contains the repository interfaces for data access.
*service* : Contains the service classes for business logic.
*src/main/resources* : Contains the application resources.
*templates* : Contains the Thymeleaf templates for the views.
*static* : Contains the static resources such as CSS and JavaScript files.
*application.properties* : Configuration file for the application.

**DEPENDENCIES**
Spring Boot Starter Web
Spring Boot Starter Thymeleaf
Spring Boot Starter Data JPA
MySQL Connector Java
Bootstrap
