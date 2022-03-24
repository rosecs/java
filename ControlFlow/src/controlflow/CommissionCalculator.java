package controlflow;

import java.util.*;

public class CommissionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose an option: ");
		
		double sales = scan.nextDouble();
		double comission = 0;
		
		if (sales > 10000) {
			comission = sales * 0.3;
		}
		else if (sales > 5000 && sales < 10000) {
			comission = sales * 0.2;
		}
		else if (sales > 1000 && sales < 5000) {
			comission = sales * 0.1;
		}
		else
			System.out.println("No hay comisión igual o debajo de $1000");
		
		System.out.println("Tu comisión es: " + comission);
			
		}

}
