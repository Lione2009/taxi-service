# Taxi Service
This web app designed to simulate simple taxi service app.
Using this app you can:
* track all available cars and working drivers
* register new drivers
* add new cars and their manufacturers
* delete cars, drivers and manufacturers
* add drivers to cars
* track your cars as a driver

### Implementation details
Project based on famous 3-layered architecture:
1. Data access layer (DAO)
1. Application layer (service)
1. Presentation layer (controllers)

### Technologies:
* Apache Tomcat (v9.0.50)
* MySQL
* JDBC
* Servlet
* JSP
* JSTL
* HTML, CSS
* Maven
* Maven Checkstyle Plugin

### Recommendation for setup
1. Configure Apache Tomcat 
2. Install MySQL and MySQL Workbench
3. Create a schema and all the necessary tables by using the script from resources/init_db.sql in MySQL Workbench
4. In the /util/ConnectionUtil.java class change the "user" and "password" properties to the ones you specified when installing MySQL
5. In the src/main/resources/log4j2.xml at line File name = "File" fileName = "logs\app.log" you need to change "logs\app.log" with absolute path to .log file)
6. Start the application
