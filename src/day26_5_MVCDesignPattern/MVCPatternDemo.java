package day26_5_MVCDesignPattern;

/*
 * Step 4: Main Application
In the main application, we'll create an instance of the Employee (Model), EmployeeView (View), and EmployeeController (Controller). 
The controller will manage the communication between the Model and View.
 */

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create the model
        Employee employee = new Employee("E123", "Ramya", "Software Engineer");

        // Create the view
        EmployeeView view = new EmployeeView();

        // Create the controller
        EmployeeController controller = new EmployeeController(employee, view);

        // Update the view
        controller.updateView();

        // Update model data through the controller
        controller.setEmployeeName("Srihari");
        controller.setEmployeeDepartment("Marketing");

        // Update the view again
        controller.updateView();
    }
}

/*

Advantages of MVC Pattern:

Separation of Concerns: Each component (Model, View, Controller) has its distinct responsibility, making the code easier to maintain and extend.
Reusability: You can reuse the same view or model with different controllers.
Testability: The separation of components makes it easier to write unit tests for each component individually.
Scalability: As your application grows, it becomes easier to manage the complexity due to the well-organized structure.

Disadvantages of MVC Pattern:
Complexity: For small applications, implementing the MVC pattern might introduce unnecessary complexity.
Overhead: There's some overhead in setting up and maintaining the components.
Tight Coupling: Sometimes, the controller might become too tightly coupled with the View and Model, reducing flexibility.

*/