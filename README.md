# Taxi Service
The goal of this project is to create  prototype of an online taxi service for drivers with authentication system.
Project based on 3-layered architecture: Data access layer (DAO), application layer (service),
presentation layer (controllers).

Using this app you can:
* Create a new car / manufacturer / driver
* Display all cars / manufacturers / drivers
* Displaying all cars of a particular driver that logged in
* Delete cars, drivers, and manufacturers
* Add driver to car
* Remove driver from car

To use all features you need to create new driver and log in.

### Technologies:
* Apache Tomcat (v9.0.50)
* MySQL
* JDBC
* Servlet
* JSP
* JSTL
* HTML, CSS
* Maven

### Recommendation for setup
1. To run the project on your computer, clone this project into your local folder and open the project in an IDE.
2. Configure Apache Tomcat 
3. Install MySQL and MySQL Workbench
4. Create a schema and all the necessary tables by using the script from resources/init_db.sql in MySQL Workbench
5. Add your parameters to taxi/util/ConnectionUtil.java
* Url to your database
* Your login to DB
* Your password to DB
* JDBC driver
6. In the src/main/resources/log4j2.xml at line File name = "File" fileName = "logs\app.log" you need to change "logs\app.log" with absolute path to .log file)
7. Start the application
