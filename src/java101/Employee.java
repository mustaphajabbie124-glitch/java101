package java101;

public class Employee {
	//Employee information(Variable)
 String empName;
 String empType;
 int empNumber;
 // Setter for employee name
 public void setEmpName(String empName) {
	 this.empName = empName;
 }
 //setter for employee type
 public void setEmpType(String empType) {
	 this.empType = empType; 
 }
//setter for employee number
 public void setEmpNumber(int empNumber) {
	 this.empNumber = empNumber;
 }
 //Getter for employee name
 public String getEmpName() {
	return empName; 
 }
 //getter for employee type
 public String getEmpType() {
	 return empType;
 }
 // Getter for employee number
 public int getEmpNumber() {
	 return empNumber;
 }
 public static void main(String [] args) {
	 //Create an employee object
	 Employee emp = new Employee();
	 // Store employee information
	 emp.setEmpName("Mustapha jabbie");
	 emp.setEmpType("Assitant");
	 emp.setEmpNumber(2025);
	 
	 //Display employee informtion
	 System.out.println("Employee Name:" + emp.getEmpName()); 
	 System.out.println("Employee Type:" + emp.getEmpType());
	 System.out.println("Employee Number:" + emp.getEmpNumber());
 }
}
