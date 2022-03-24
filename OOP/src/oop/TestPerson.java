package oop;


public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person alonso = null;// creado fuera del bloque para poder acceder a él
		try {
			
			Employee briana = new Employee("Briana","Valencia",20,"briana.valencia@generation.org", "Mentoría", 1200);
			System.out.println(briana.calculateSalary());
			System.out.println(briana);
			
			Employee jess = new Employee("Jess","Hernández",20,"jess.hernandez@generation.org", "Mentoría", 1200);
			System.out.println(jess.calculateSalary());
			System.out.println(jess);
			
			Manager rufs = new Manager("Rufino", "Tamayo", 50, "elrufus@gmail.com", "Logística", 1500.0, 20, 0.25f);
			System.out.println(rufs.calculateSalary());
			System.out.println(rufs);
			
			alonso = new  Employee("Alonso", "Grajeda", 15, "alonso.grajeda@generation.org", "Mentoria", 150.00);
			// alonso = new  Person("Alonso", "Grajeda", 15, "alonso.grajeda@generation.org"); alonso as person object
			System.out.println("His salary is " + ((Employee) alonso).calculateSalary());
			
			Proveedor pepito = new Proveedor("Pepito",40,150);
			System.out.println(pepito);
			//alonso.setFirstName("Alonso Ismael");
			//alonso.setAge(22);
			//alonso.setEmail("alonsoenyahoocommx");
			//Payroll.calculatePayment(briana);
		} 
		catch (EmailFormatException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			System.out.println(alonso);
			System.out.println("Total de personas: " + Person.getTotal());			System.out.println(alonso.getFirstName());
			System.out.println(alonso.getEmail());
			System.out.println(alonso.getAge());
		}
	}

}
