package controlflow;

import java.util.*;

public class ConditionalIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		double age = scan.nextDouble();
		// TODO Auto-generated method stub
		if ( age >= 18 && age <= 150) {
			System.out.println(" You are an adult! ");// Ejecutar declaraci�n de bloque;
		}
		else if(age >= 0 && age <= 17 ) {
			System.out.println(" You are a child! ");// Ejecutar segunda declaraci�n de bloque de condici�n;
		} else{
			// Ejecutar otra declaraci�n de bloque;
		}


	}

}
