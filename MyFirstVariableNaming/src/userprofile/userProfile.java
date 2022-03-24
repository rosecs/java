package userprofile;

import java.util.Scanner;

// the app stores a users name, age, gender, job preference, nationality and blood type
public class userProfile {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Please enter your name ");
		String name = console.next();
		System.out.println("Please enter your age ");
		//String age = console.next();
		int age = console.nextInt(); // Para convertir de String a int
		int yearOfBirth = 2022 - age;
 
		System.out.println("Please enter your gender ");
		String gender = console.next();
		System.out.println("Please enter your job preference ");
		String jobPreference = console.next();
		System.out.println("Please enter your nationality ");
		String nationality = console.next();
		System.out.println("Please enter your blood type ");
		String bloodType = console.next();
		
		System.out.println("My name is "+ name + ". I'm " + age + " years old. My gender is " + gender + ". My job preference is " + jobPreference + " and I'm " + nationality + ". My blood type is " + bloodType + ".");
	}

}
