package day26_5_MVCDesignPattern;

/*
 * The MVC (Model-View-Controller) design pattern is an architectural pattern that separates an application into three main logical components: Model, View, and Controller. Each of these components has a specific responsibility, which helps in organizing the code and separating concerns.

Model: Represents the application's data and business logic.
View: Represents the UI (User Interface) elements and the presentation logic.
Controller: Acts as an intermediary between the Model and View, handling user input and updating the View based on changes to the Model.
This pattern is widely used in web development, where you often need to separate concerns related to data (Model), user interface (View), and control flow (Controller).
 */

/*
 * create an example of an Employee Management application using the MVC pattern. We'll have the following components:

Model: Employee data (like id, name, and department).
View: Displays employee details.
Controller: Manages the interaction between the Model and View.
 */

/*
 * Step 1: Model (Employee)
The Model represents the data and business logic. In this case, it's the Employee class.
 */

//Employee Model
public class Employee {
 private String id;
 private String name;
 private String department;

 public Employee(String id, String name, String department) {
     this.id = id;
     this.name = name;
     this.department = department;
 }

 // Getters and Setters
 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }
}

