package controlflow;

import java.util.*;

public class ConditionalIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		double age = scan.nextDouble();
		// TODO Auto-generated method stub
		if ( age >= 18 && age <= 150) {
			System.out.println(" You are an adult! ");// Ejecutar declaración de bloque;
		}
		else if(age >= 0 && age <= 17 ) {
			System.out.println(" You are a child! ");// Ejecutar segunda declaración de bloque de condición;
		} else{
			// Ejecutar otra declaración de bloque;
		}


	}

}
