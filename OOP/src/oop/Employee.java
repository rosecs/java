package oop;

public class Employee extends Person implements Payable{
	private String department;
	private double salary;
	
	public Employee(String firstName, String lastName, int age, String email, String department ,double salary) 
		throws EmailFormatException {
		super(firstName, lastName, age, email);
		this.department = department.toUpperCase();
		this.salary = salary;
	}// constructor
	
	public double calculateSalary() {
		return this.salary * 21 * 1.16;
	}

	
	public String getDepartment() {
		return department;
	} // getDepartment
	
	public void setDepartment(String department) {
		this.department = department;
	} // setDepartment
	public double getSalary() {
		return salary;
	} // getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	} // setSalary
	
//	@Override
//	public String toString() {
//		return "Employee [department=" + department + ", salary=" + salary + ", getFirstName()=" + getFirstName()
//				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
//	}

	@Override
	public String toString() {
		return super.toString() + " - Employee [department=" + department + ", salary=" + salary + "]";
	}
}
