package JAVALoops;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n1=0;
		int n2=1;
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");

		int numero = sc.nextInt();
		System.out.println("n°| Fibonacci(n)");
		
		do {
			System.out.println(i+" |  "+n1);
			int siguienteTermino = n1+n2;
			n1=n2;
			n2=siguienteTermino;
			i++;
		} while (i<numero+1);
		
	}


}
