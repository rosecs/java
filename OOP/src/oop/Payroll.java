package oop;

public class Payroll {
	public static void calculatePayment(Payable e) {
		System.out.println("===============================");
		System.out.println("Calculate payment: " + e);
		System.out.println("===============================");
		System.out.println(e.calculateSalary() - (e.calculateSalary()*0.30));
	} // calculate the payment
}// Payroll 