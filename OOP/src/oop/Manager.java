package oop;

public class Manager extends Employee{
	private int numberOfEmployees;
	private float percentage;
	
	public Manager(String fistName, String lastName, int age, String email,String department ,double salary,int numberOfEmployees, float percentage)
		throws EmailFormatException {
		super(fistName, lastName, age, email,department,salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	}//constructor
	
	@Override
	public double calculateSalary() {
		return (this.getSalary() * 21 * 1.16) * (percentage + 1) * 1.16;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage + ", getDepartment()="
				+ getDepartment() + ", getSalary()=" + getSalary() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	} //getNumberOfEmployees

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	} //setNumberOfEmployees

	public float getPercentage() {
		return percentage;
	} //getPercentage

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	} //setPercentage

} //Class Manager