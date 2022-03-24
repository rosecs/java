package tiendita;
import java.util.*;

public class Tiendita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a la tiendita de los estudiambres, \nA continuación te ofrecemos el siguiente menú... \n1. Paquete básico \n2. Paquete chucherías \n3. Paquete sano \n4. Paquete romántico");
		System.out.println("Introduce el número que corresponde a la opción que quieres");
				
		Scanner scan = new Scanner (System.in);
		
		double option = scan.nextDouble();
		int option1 = (int)option;

		if(option == 1) {
			System.out.println("El precio del paquete 1000");
		}else if(option == 2) {
			System.out.println("El precio del paquete 2000");
		}else if(option == 3) {
			System.out.println("El precio del paquete 3000");
		}else if(option == 4) {
			System.out.println("El precio del paquete 4000");
		}else {
			System.out.println("Hoy no me surtieron de esa joven... hijole joven te la debo... hoy no fio, mañana sí... no hay yaaa");
		}
	}
}

