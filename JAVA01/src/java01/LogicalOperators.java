package java01;

import java.util.*;

public class LogicalOperators {
	public static void main(String[] args) {
		// https://github.com/generation-org/JAVA/tree/master/Logic%20Operators
		/* enters the grade of a student 
		Failed if they scored 3 or less
		Insufficient if they scored > 3 but less than 5. (5 included)
		Good if they scored > 5 but less than 8. (8 included)
		Excellent Grade if they scored 10.
		if participants enter a negative number or a number outside the range supported (outside 0 - 10)
		*/
		Scanner SC = new Scanner(System.in);
		double Grade;
		System.out.println("introduce tu calificacion: ");
		Grade = SC.nextDouble();
		
		if((Grade<=3) && (Grade >= 0)) {
			System.out.println("failed u.u ");
		} else if((Grade >3 )&&(Grade <= 5)) {
			System.out.println("Insufficient");
		}else if((Grade > 5)&&(Grade <= 9)) {
			
			System.out.println("Good");
		}else if (Grade == 10) {
			
			System.out.println("excellent");
		}else {
			
			System.out.println("error please enter your grades");
		}
		
	}


}
