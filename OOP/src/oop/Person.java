package oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private static int total = 0;
	
	public Person(String fistName, String lastName, int age, String email) throws EmailFormatException {
		super();
		total ++;
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.age = (age<18)?18:age;
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches() ) {
			this.email = email;
		} else {
			throw new EmailFormatException("The format of email is invalid"); //throw a new exception
		}
			
	}
	
	public Person() {} //constructor
	
	public static int getTotal( ) {
		return total;
	} //getTotal

	public String getFirstName() {
		return firstName;
	} //getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	} //setFirstName

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age<18)?18:age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email)throws EmailFormatException {
		this.email = "noemail@nodomain.com";
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches()) {
			this.email = email;
		} else {
			throw new EmailFormatException("The format of email is invalid");//throw a new exception
		}
	}	
}
