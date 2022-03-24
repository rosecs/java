package oop;

public class Proveedor implements Payable {
	private String socialNumber;
	private int quantity;
	private double unitPrice;
	
	// 1. Constructor para todas las propiedades
	// 2. Crear Getters and Setters
	// 3. Crear el toString() con todas las propiedades
	
	public Proveedor(String socialNumber, int quantity, double unitPrice) {
		super();
		this.socialNumber = socialNumber;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	} // constructor

	public String getSocialNumber() {
		return socialNumber;
	} // getSocialNumber

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	} // setSocialNumber

	public int getQuantity() {
		return quantity;
	} //getQuatitity

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Proveedor [socialNumber=" + socialNumber + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return (getQuantity() * getUnitPrice()) * 1.16;
	}
	
	
}
