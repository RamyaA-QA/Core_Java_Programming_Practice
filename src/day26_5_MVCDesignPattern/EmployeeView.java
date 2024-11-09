package day26_5_MVCDesignPattern;

/*
 * Step 2: View (EmployeeView)
The View is responsible for displaying the employee details.
 */

//Employee View
public class EmployeeView {
 public void printEmployeeDetails(String employeeId, String employeeName, String employeeDepartment) {
     System.out.println("Employee Details:");
     System.out.println("ID: " + employeeId);
     System.out.println("Name: " + employeeName);
     System.out.println("Department: " + employeeDepartment);
 }
}
