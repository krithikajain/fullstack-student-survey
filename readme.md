# SWE Assignment 3
### Team members
Krithika Jain - G01462514<br>
Mizba Chougle - G01397586

## Description
In this assignment, we developed a full-stack application using Angular for the frontend and Spring Boot for the backend. <br>
It allows prospective students to:
- Submit a survey about their campus visit experience.
- View, update, and delete existing surveys. (CRUD operations)

## Technologies Used
#### Frontend:
- Angular: v15+
- Bootstrap: For styling and responsiveness.
#### Backend:
- Spring Boot: v3.3.5
- AWS RDS (MySQL): For data storage.
<br>

## Setup Instructions
### 1. Prerequisites
- Java 17+
- Maven
- Node.js and npm
- Angular CLI
- AWS RDS Instance: Ensure you have an AWS RDS MySQL database set up and running.
- MySQL CLI/ Workbench

###  2. Setting Up AWS RDS
1. Log in to your AWS Management Console.
2. Navigate to the RDS service and click Create Database.
3. Database Engine: MySQL.
Template: Free tier (if eligible).
4. DB Instance Identifier: student-survey-db.
5. Master Username: Choose a username (e.g., admin).
6. Master Password: Set a secure password.
7. Allocated Storage: 20 GiB (default).
8. Configure connectivity:
Ensure the RDS instance is publicly accessible.
Set up a security group to allow inbound traffic on port 3306 from your local machine’s IP address.
9. Create a database named student_survey in your RDS instance:
- Connect to the database using MySQL CLI or MySQL Workbench:
```bash
mysql -h <AWS_RDS_ENDPOINT> -u <YOUR_RDS_USERNAME> -p
```
- Create the database:
```sql
CREATE DATABASE student_survey;
```
- Exit the MySQL prompt.
- Later to view the surveys in the database:
```sql
SELECT * FROM surveys;
```

### 3. Backend Setup
1. Navigate to the backend directory:
```bash
cd student-survey
```
2. Configure the database in application.properties: 
```bash
spring.datasource.url=jdbc:mysql://student-survey-db.c3emucicqwne.us-east-1.rds.amazonaws.com:3306/student_survey
spring.datasource.username=admin
spring.datasource.password=123admin456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
3. Run the backend:
```bash
mvn spring-boot:run
```
4. Verify the backend is running by visiting:
```arduino
http://localhost:8080/api/surveys
```

### 4. Frontend Setup
1. Navigate to the frontend directory:
```bash
cd student-survey-front
```
2. Install dependencies:
```bash
npm install
```
3. Start the Angular development server:
```bash
ng serve --open
```
4. The application will open in your browser at:
```arduino
http://localhost:4200
```


### 5. Perform CRUD Operations
- Create: <br>To create a new survey, click the "Student Survey" button on the homepage, fill out the survey form, and click Submit to save it.
- Read: <br>To view all surveys, click the "List All Surveys" button on the homepage. This will display a table of all submitted surveys.
- Update: <br>In the "All Surveys" table, click the Edit button for the survey you want to modify, update the fields, and save the changes.
- Delete: <br>In the "All Surveys" table, click the Delete button next to a survey to remove it permanently.