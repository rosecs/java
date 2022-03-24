import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s= new Scanner(System.in); // use scanner method to print
		 
		 System.out.println ("Enter the height: "); 
		 double height = s.nextDouble();
		 
		 System.out.println ("Enter the base: ");
		 double base = s.nextDouble();
		 
		 double area =(base * height)/2; 
		 System.out.println("The area of the triangle is: " + area);

	}

}
