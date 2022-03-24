package arrays;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arreglo[] = {"Mau", "Sofi", "Sam","Abril"};
		
		System.out.println(arreglo[0]);
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		System.out.println(cars);
		//Acceder a un artículo
		
		cars.get(0);
		System.out.println(cars.get(0));
		cars.add("Mazda");
		System.out.println(cars);
		//Cambiar un artículo
		cars.set(0, "Susuki");
		System.out.println(cars);
		//Eliminar un artículo
		cars.remove(1);
		System.out.println(cars);
		//Tamaño de ArrayList
		System.out.println(cars.size());
		
		
		
		for(String i:cars) {
			
			System.out.println(i);
		}

	}

}
