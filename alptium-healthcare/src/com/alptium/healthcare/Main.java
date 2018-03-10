package com.alptium.healthcare;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Welcome to Healthcare application");
		System.out.println("Now, you'll have to choose the option you need!");
		System.out.println("If you want to go to < DOCTOR > page, enter D");
		System.out.println("If you want to go to < PATIENT > page, enter PA");
		System.out.println("If you want to go to < MEDICINE > page, enter M");
		System.out.println("If you want to go to < PHARMACIES > page, enter PH");
		System.out.println("If you want to schedule a treatment, enter SC");

		System.out.println("Please, enter the path for your choise!");
		
		String choise = sc.next();
			  
		if(choise.equals("D") || choise.equals("d")) {
			 runDemoDoctor(); 
		} else if(choise.equals("PA") || choise.equals("pa") ) {
			 runDemoPatient();
		} else if(choise.equals("M") || choise.equals("m")) {
			 runDemoMedicine();		
		} else if(choise.equals("PH") || choise.equals("ph")) {
			 runDemoPharmacie();
		} else if(choise.equals("SC") || choise.equals("sc")) {
			 runDemoScheduling();
		} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph")) {
			System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
			
			 System.out.println("Please, TRY AGAIN");
			 System.out.println();
			 choise = sc.next();
		 }
		 
	}		
		
}
		
		private static void runDemoDoctor() {
			
			System.out.println("Welcome to the page DOCTOR");
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
				System.out.println("Your registration is done. Plese check the data once more.");
				System.out.println("Your firstname and lastname:" + doctor.getFirstName() + "\t" + doctor.getLastName() );
				System.out.println("Year of birth:" + doctor.getBirthyear());
				System.out.println("You are employed full-time:" + doctor.getisFullTimeEmployee() );
				System.out.println("Your specialization:" + doctor.getSpecialization());
				System.out.println("Your qualification:" + doctor.getQualification());
			}
		}
		
		private static void runDemoPatient() {
			
			System.out.println("Welcome to the page PATIENT");
			System.out.println();
			System.out.println("For registration, insert personal data for a patient...");
			System.out.println();
			
			try(Scanner sc = new Scanner(System.in)){
				
				System.out.println("Enter patient name");
				String name = sc.next();
				
				System.out.println("Enter patient parent's name");
				String parentName = sc.next();
				
				System.out.println("Enter patient surname");
				String surname = sc.next();
				
				System.out.println("Enter patient jmbg");
				String jmbg = sc.next();
				
				System.out.println("Enter patient date od birth");
				String dateOfBirth = sc.next();
				
				System.out.println("Enter patient place of birth");
				String placeOfBirth = sc.next();
				
				System.out.println("Enter patient gender. Choose M or F");
				String gender = sc.next();
				
				System.out.println("Enter patient ID");
				String ID = sc.next();
				
				System.out.println("Enter patient address");
				String address = sc.next();
				
				System.out.println("Enter the name of town where patient lives");
				String town = sc.next();
				
				System.out.println("Enter patient citizenship");
				String citizenship = sc.next();
				
				System.out.println("Enter patient phoneNumber");
				String phoneNumber = sc.next();
				
				Patient patient = new Patient(name, parentName, surname, jmbg, dateOfBirth, placeOfBirth, gender, ID, address, town, citizenship, phoneNumber  );
				System.out.println("You registration is done. Plese check the data once more.");
				System.out.println("Patient name and surname: " + patient.getName() + "\t" + patient.getSurname() );
				//System.out.println("Patient jmbg" +  );
				System.out.println("Date and place of birth: "+ patient.getPlaceOfBirth() + "\t" + patient.getDateOfBirth());
				System.out.println("Gender: " + patient.getGender());
				System.out.println("Healcare card ID: " + patient.getID());
				System.out.println("Address: " + patient.getAddress() + "\t" + patient.getTown() );
				System.out.println("Citizenship: " + patient.getCitizenship() );
				System.out.println("Patient phone number: " + patient.getPhoneNumber() );

			}
		}
		
		private static void runDemoMedicine() {

			System.out.println("Welcome to the page MEDICINE");

		}
		
		private static void runDemoPharmacie() {
			System.out.println("Welcome to the page PHARMACIES");

		}
		
		private static void runDemoScheduling( ) {
			
			System.out.println("Welcome to the page SCHEDULING");
			System.out.println("Please, insert necessary data in order to schedule your treatment...");
			
			//while (true) {
				
			try(Scanner sc = new Scanner(System.in)){
				
				System.out.println("Enter patient name");
				String name = sc.next();
				
				System.out.println("Enter patient parent's name");
				String parentName = sc.next();
				
				System.out.println("Enter patient surname");
				String surname = sc.next();
				
				System.out.println("Enter patient jmbg");
				String jmbg = sc.next();
				
				System.out.println("Enter patient ID");
				String ID = sc.next();
				
				Patient scheduling = new Patient(name, parentName, surname, jmbg, ID );

				System.out.println("You registration is done. Plese check the data once more.");
				System.out.println("Patient name and surname: " + scheduling.getName() + "\t" + scheduling.getSurname() );
				//System.out.println("Patient jmbg: " +  );
				System.out.println("Healcare card ID: " + scheduling.getID());
				
				System.out.println("Please, check your data");
				System.out.println("If it is correct, enter yes");
				System.out.println("If it is incorrect, enter no and fill in the form again");

				/*String check = sc.next(); 
				
				if (check.equals("yes")) {
					break;
				} else while (!check.equals("no") && !check.equals("yes")) {
					System.out.println("You entered the wrong word, plase response with yes or no!");
					System.out.println("Is the data correct? yes/no");
					System.out.println();
					check = sc.next();
				}
				
				 if (check.equals("yes")) {
						break;
						
				}
							 
			}*/
			
		}
			
	}
		
}
