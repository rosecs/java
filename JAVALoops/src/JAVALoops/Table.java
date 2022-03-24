package JAVALoops;
import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        
	        int i = 0;
	        while(i < 11) {
	        	System.out.println(num+"x"+i+"="+num*i);	
	        	i++;
	        }

	                
	        System.out.println("Multiplication Table of " + num);
	        
	       // TODO: Implement a while loop that prints out the multiplication table of the given input number.
	    }
	}