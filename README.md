# ConceptsOfObjectOrientedDesign

## Problem Statement
1. The application intended to solve the problem of day care for children.
2. It assigns students to teachers and student and teachers to classrooms based on ClassroomRules.
3. Implements CRUD(Create, Read, Update, Delete) functionality for Students, Teachers  and Vaccines. Does not add teachers or students to classroom if classroom is full of its      maximum capacity according to state regulations.
4. Defines vaccines needed to be taken based on age groups.
5. Implements Annual Registration Renewal for students.
6. Tracks Immunization Records for a particular students.
7. Track Immunization Anniversaries for all students.
8. Track overdue of vaccines for all students.

# Architecture
Design Patterns Used
1. Factory Design Pattern
2. Model View Controller 
3. Lazy Singleton Pattern

Technologies Used:
1.Java
2.Java Swing
3.Spring MVC
4.MySQL

# Architecture Explained
1. App.java:
   Contains the main method and is called first when we start an application.
   It instantiates MainJFrame(View) and Controller(MainController).
  
2. View:
   Designed using Swing. Layout used is Card Layout.
 
3. Controller:
   Whenever an event is dispatched then controller is called. For example: a  button is clicked. Validation are done in this part. Like if user want to see an student  he/she
   should enter a valid id.
   
4. MiddleWare:
   Controller calls the middleware. It takes the action like to add a student, delete a student and then call database MySQL to update the changes. Implemented using             Factory Design Pattern and Lazy Singleton Design Pattern.
   
5. Model: 
   Classes that represent data. This data is then added to database.


