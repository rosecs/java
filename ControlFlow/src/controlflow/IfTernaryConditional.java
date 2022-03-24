package controlflow;

import java.util.*;

public class IfTernaryConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		double age = scan.nextDouble();
		
		System.out.println((age >= 18 && age <= 150 ) ? "You are an adult!" : ((age >= 0 && age <= 17) ? "You are a child": " This value is out of range. Are you a human? " ));


	}

}
