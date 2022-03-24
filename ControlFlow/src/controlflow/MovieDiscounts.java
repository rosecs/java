package controlflow;

import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		double age = scan.nextDouble();
		
		double price = 7;
		if (age < 5) {
			price = price * 0.4;
		}
		else if (age > 60) {
			price = price * 0.45;
		}
		else {
			System.out.println("How many tickets would you want?");
			int quantity = scan.nextInt();
			
			if (quantity >= 2) {
				price = price * quantity * 0.7;
			}
		}
		
		System.out.println("The total is: " + price + " Euros.");


	}

}
