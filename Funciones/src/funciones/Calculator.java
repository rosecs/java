package funciones;

import java.util.*;

public class Calculator {
	
	static double sum( double a , double b, double c) {
		return a + b + c; 
	}
	
	static double substraction( double a , double b, double c) {
		return a - b - c; 
	}
	
	static double multiply( double a , double b, double c) {
		return a * b * c ; 
	}
	
	static double divide( double a , double b, double c) {
		return (a / b) / c ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("-------------- Welcome to Generation Calculator ----------- ");
		
		
		Scanner scan1 = new Scanner (System.in);
		System.out.print("Enter any positive integer: ");
		double num1;
		num1 = scan1.nextDouble();
		
		Scanner scan2 = new Scanner (System.in);
		System.out.print("Enter a second positive integer: ");
		double num2;
		num2 = scan2.nextDouble();
		
		Scanner scan3 = new Scanner (System.in);
		System.out.print("Enter a third positive integer: ");
		double num3;
		num3 = scan3.nextDouble();
	        
	  
	        
		System.out.println("The result of " + num1 + " + " + num2 + " + " + num3 + " = " + sum(num1,num2,num3));
		System.out.println("The result of " + num1 + " - " + num2 + " - " + num3 + " = " + substraction(num1,num2,num3));
		System.out.println("The result of " + num1 + " * " + num2 + " * " + num3 + " = " + multiply(num1,num2,num3));
		System.out.println("The result of " + num1 + " / " + num2 + " / " + num3 + " = " + divide(num1,num2,num3));
	}

}
