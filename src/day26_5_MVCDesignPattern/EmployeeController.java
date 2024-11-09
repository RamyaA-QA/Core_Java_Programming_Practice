package day26_5_MVCDesignPattern;

/*
 * Step 3: Controller (EmployeeController)
The Controller handles the logic of updating the View based on changes to the Model and vice versa.
 */

//Employee Controller
public class EmployeeController {
 private Employee model;
 private EmployeeView view;

 public EmployeeController(Employee model, EmployeeView view) {
     this.model = model;
     this.view = view;
 }

 public void setEmployeeName(String name) {
     model.setName(name);
 }

 public String getEmployeeName() {
     return model.getName();
 }

 public void setEmployeeId(String id) {
     model.setId(id);
 }

 public String getEmployeeId() {
     return model.getId();
 }

 public void setEmployeeDepartment(String department) {
     model.setDepartment(department);
 }

 public String getEmployeeDepartment() {
     return model.getDepartment();
 }

 public void updateView() {
     view.printEmployeeDetails(model.getId(), model.getName(), model.getDepartment());
 }
}

