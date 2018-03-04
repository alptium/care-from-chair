package doctor;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Welcome to our hospital");
		System.out.println("Follow the instructions and complete our application:");
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Please enter your firstname:");
			String firstName = sc.next();
			System.out.println("Please enter your lastname:");
			String lastName = sc.next();
			System.out.println("Please enter your birthyear:");
			int birthYear=sc.nextInt();
			System.out.println("Are you employed full-time:");
			boolean isFullTimeEmployee = sc.nextBoolean();
			System.out.println("Please enter your specialization:");
			String specialization = sc.next();
			System.out.println("Please enter your qualification:");
			String qualification = sc.next();
			
			Doctor doctor = new Doctor(firstName, lastName, birthYear, isFullTimeEmployee, specialization, qualification);
		}
	}
}
	
