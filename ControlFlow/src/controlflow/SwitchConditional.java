package controlflow;

import java.util.*;

public class SwitchConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose an option: ");
		
		String selectedOption = scan.nextLine();
		
		switch (selectedOption){
		case "1" :
			System.out.println("You selected a health menu.");
		break;
		case "2":
			System.out.println("You selected a basic menu.");
		break;
		default:
			System.out.println("Try again! This option isn't avaible.");
		break;
	}


	}

}
