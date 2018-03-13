package com.alptium.healthcare;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
			
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Welcome to Healthcare application!");
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
		} else if(choise.equals("PA") || choise.equals("pa")) {
			 runDemoPatient();
		} else if(choise.equals("M") || choise.equals("m")) {
			 runDemoMedicine();		
		} else if(choise.equals("PH") || choise.equals("ph")) {
			 runDemoPharmacie();
		} else if(choise.equals("SC") || choise.equals("sc")) {
			 runDemoScheduling();
		} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc")) {
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
				System.out.println("You are employed full-time:" + doctor.getIsFullTimeEmployee() );
				System.out.println("Your specialization:" + doctor.getSpecialization());
				System.out.println("Your qualification:" + doctor.getQualification());
				System.out.println();
				System.out.println();

				try(Scanner scc = new Scanner(System.in)) {
					
					System.out.println("If your data is coorect and you wish to continue, choose another option!");
					System.out.println("If your data is coorect and you wish to exit, choose BR");
					System.out.println("If your data is not correct, go to <DOCTOR> page again!");
					System.out.println("If you want to go to < DOCTOR > page, enter D");
					System.out.println("If you want to go to < PATIENT > page, enter PA");
					System.out.println("If you want to go to < MEDICINE > page, enter M");
					System.out.println("If you want to go to < PHARMACIES > page, enter PH");
					System.out.println("If you want to schedule a treatment, enter SC");

					System.out.println("Please, enter the path for your choise!");
					
					String choise = scc.next();
						  
					if(choise.equals("D") || choise.equals("d")) {
						 runDemoDoctor(); 
					} else if(choise.equals("PA") || choise.equals("pa")) {
						 runDemoPatient();
					} else if(choise.equals("M") || choise.equals("m")) {
						 runDemoMedicine();		
					} else if(choise.equals("PH") || choise.equals("ph")) {
						 runDemoPharmacie();
					} else if(choise.equals("SC") || choise.equals("sc")) {
						 runDemoScheduling();
					} else if(choise.equals("br") || choise.equals("BR")) {
					} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc") && !choise.equals("BR") && !choise.equals("br")) {
						System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
						
						 System.out.println("Please, TRY AGAIN");
						 System.out.println();
						 choise = sc.next();
					 }

				}
				
			}
			
		}
		
		private static void runDemoPatient() {
			
			System.out.println("Welcome to the page PATIENT");
			System.out.println();
			System.out.println("For registration, insert personal data for a patient...");
			System.out.println();
			
			ArrayList<Patient> PatientList = new ArrayList<>();

			
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
				String id = sc.next();
				
				System.out.println("Enter patient address");
				String address = sc.next();
				
				System.out.println("Enter the name of town where patient lives");
				String town = sc.next();
				
				System.out.println("Enter patient citizenship");
				String citizenship = sc.next();
				
				System.out.println("Enter patient phoneNumber");
				String phoneNumber = sc.next();
				
				Patient patient = new Patient(name, parentName, surname, jmbg, dateOfBirth, placeOfBirth, gender, id, address, town, citizenship, phoneNumber );
				System.out.println("You registration is done. Plese check the data once more.");
				System.out.println("Patient name and surname: " + patient.getName() + "\t" + patient.getSurname());
				System.out.println("Patient parent's name: " + patient.getParentName());
				System.out.println("Patient jmbg: " + patient.getJmbg()  );
				System.out.println("Date and place of birth: "+ patient.getPlaceOfBirth() + "\t" + patient.getDateOfBirth());
				System.out.println("Gender: " + patient.getGender());
				System.out.println("Healcare card ID: " + patient.getId());
				System.out.println("Address: " + patient.getAddress() + "\t" + patient.getTown());
				System.out.println("Citizenship: " + patient.getCitizenship());
				System.out.println("Patient phone number: " + patient.getPhoneNumber());
				System.out.println();
				System.out.println();
				
				
				
				try(Scanner scc = new Scanner(System.in)) {
					
					System.out.println("If your data is coorect and you wish to continue, choose another option!");
					System.out.println("If your data is coorect and you wish to exit, choose BR");
					System.out.println("If your data is not correct, go to <PATIENT> page again!");
					System.out.println("If you want to go to < DOCTOR > page, enter D");
					System.out.println("If you want to go to < PATIENT > page, enter PA");
					System.out.println("If you want to go to < MEDICINE > page, enter M");
					System.out.println("If you want to go to < PHARMACIES > page, enter PH");
					System.out.println("If you want to schedule a treatment, enter SC");

					System.out.println("Please, enter the path for your choise!");
					
					String choise = scc.next();
						  
					if(choise.equals("D") || choise.equals("d")) {
						 runDemoDoctor(); 
					} else if(choise.equals("PA") || choise.equals("pa")) {
						 runDemoPatient();
					} else if(choise.equals("M") || choise.equals("m")) {
						 runDemoMedicine();		
					} else if(choise.equals("PH") || choise.equals("ph")) {
						 runDemoPharmacie();
					} else if(choise.equals("SC") || choise.equals("sc")) {
						 runDemoScheduling();
					} else if(choise.equals("br") || choise.equals("BR")) {
						PatientList.add(patient);
					} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc") && !choise.equals("BR") && !choise.equals("br")) {
						System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
						
						 System.out.println("Please, TRY AGAIN");
						 System.out.println();
						 choise = sc.next();
					 }

				}
				
			}
			
		}
		
		private static void runDemoMedicine() {

			System.out.println("Welcome to the page MEDICINE");
			
			//TO DO Basic input/output
			
			System.out.println();
			System.out.println();

			try(Scanner scc = new Scanner(System.in)) {
				
				System.out.println("If your data is coorect and you wish to continue, choose another option!");
				System.out.println("If your data is coorect and you wish to exit, choose BR");
				System.out.println("If your data is not correct, go to <MEDICINE> page again!");
				System.out.println("If you want to go to < DOCTOR > page, enter D");
				System.out.println("If you want to go to < PATIENT > page, enter PA");
				System.out.println("If you want to go to < MEDICINE > page, enter M");
				System.out.println("If you want to go to < PHARMACIES > page, enter PH");
				System.out.println("If you want to schedule a treatment, enter SC");

				System.out.println("Please, enter the path for your choise!");
				
				String choise = scc.next();
					  
				if(choise.equals("D") || choise.equals("d")) {
					 runDemoDoctor(); 
				} else if(choise.equals("PA") || choise.equals("pa")) {
					 runDemoPatient();
				} else if(choise.equals("M") || choise.equals("m")) {
					 runDemoMedicine();		
				} else if(choise.equals("PH") || choise.equals("ph")) {
					 runDemoPharmacie();
				} else if(choise.equals("SC") || choise.equals("sc")) {
					 runDemoScheduling();
				} else if(choise.equals("br") || choise.equals("BR")) {
				} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc") && !choise.equals("BR") && !choise.equals("br")) {
					System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
					
					 System.out.println("Please, TRY AGAIN");
					 System.out.println();
					 choise = scc.next();
				 }

			}
			
		}
		
		private static void runDemoPharmacie() {
			
			System.out.println("Welcome to the page PHARMACIE");
			System.out.println("Follow the instructions and complete our application:");
			
			try(Scanner sc = new Scanner(System.in)){
				
				System.out.println("Please enter your Pharmacie name:");
				String nameOfPharmacie = sc.next();
				System.out.println("Please enter registration number of Pharmacie:");
				int registerNumber = sc.nextInt();
				System.out.println("Please enter the city where your Pharmacie is located:");
				String city=sc.next();
				System.out.println("Please enter the cityMunicipality  where your Pharmacie is located:");
				String cityMunicipality  = sc.next();
				System.out.println("Please enter phone number of your Pharmacie:");
				String phoneNumber= sc.next();
				System.out.println("Please enter your adress of your Pharmacie:");
				String address = sc.next();
				System.out.println("Please confirm if your Pharmacie have online shoping option");
				String onlineShoping = sc.next();
				System.out.println("Please enter name of owner:");
				String nameOfOwner  = sc.next();
				
				Pharmacie pharmacie = new Pharmacie(nameOfPharmacie, registerNumber, city, cityMunicipality,  phoneNumber, address, onlineShoping, nameOfOwner);
				System.out.println("Your registration is done. Plese check the data once more.");
				System.out.println("Your name of Pharmacie:" + pharmacie.getNameOfPharmacie());
				System.out.println("Your registar number is:" + pharmacie.getRegisterNumber());
				System.out.println("City and cityMuniciplatity of Phramacie is:" + pharmacie.getCity() + pharmacie.getCityMunicipality());
				System.out.println("Phone number and adress of your Pharmacie is:" + pharmacie.getPhoneNumber() + pharmacie.getAddress());
				System.out.println("Your Pharmacie has online shoping option:" + pharmacie.getOnlineShoping());
				System.out.println("Name of owner is:" + pharmacie.getNameOfOwner());
	
				
			try(Scanner scc = new Scanner(System.in)) {
				
				System.out.println("If your data is coorect and you wish to continue, choose another option!");
				System.out.println("If your data is coorect and you wish to exit, choose BR");
				System.out.println("If your data is not correct, go to <PHARMACIES> page again!");
				System.out.println("If you want to go to < DOCTOR > page, enter D");
				System.out.println("If you want to go to < PATIENT > page, enter PA");
				System.out.println("If you want to go to < MEDICINE > page, enter M");
				System.out.println("If you want to go to < PHARMACIE > page, enter PH");
				System.out.println("If you want to schedule a treatment, enter SC");

				System.out.println("Please, enter the path for your choise!");
				
				String choise = scc.next();
					  
				if(choise.equals("D") || choise.equals("d")) {
					 runDemoDoctor(); 
				} else if(choise.equals("PA") || choise.equals("pa")) {
					 runDemoPatient();
				} else if(choise.equals("M") || choise.equals("m")) {
					 runDemoMedicine();		
				} else if(choise.equals("PH") || choise.equals("ph")) {
					 runDemoPharmacie();
				} else if(choise.equals("SC") || choise.equals("sc")) {
					 runDemoScheduling();
				} else if(choise.equals("br") || choise.equals("BR")) {
				} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc") && !choise.equals("BR") && !choise.equals("br")) {
					System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
					
					 System.out.println("Please, TRY AGAIN");
					 System.out.println();
					 choise = scc.next();
				 }

			}
			}
		}
		
		private static void runDemoScheduling() {
			
			System.out.println("Welcome to the page SCHEDULING");
			System.out.println("Please, insert necessary data in order to schedule your treatment...");			
				
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
				String id = sc.next();
				
				Patient scheduling = new Patient(name, parentName, surname, jmbg, id);

				System.out.println("You registration is done. Plese check the data once more.");
				System.out.println("Patient name and surname: " + scheduling.getName() + "\t" + scheduling.getSurname());
				System.out.println("Patient parent's name: " + scheduling.getParentName());
				System.out.println("Patient jmbg: " + scheduling.getJmbg());
				System.out.println("Healcare card ID: " + scheduling.getId());
				
				System.out.println("Please, check your data");
				System.out.println("If it is correct, enter yes");
				System.out.println("If it is incorrect, enter no and fill in the form again");
				System.out.println();
				System.out.println();

				try(Scanner scc = new Scanner(System.in)) {
					
					System.out.println("If your data is coorect and you wish to continue, choose another option!");
					System.out.println("If your data is coorect and you wish to exit, choose BR");
					System.out.println("If your data is not correct, go to <SCHEDULING> page again!");
					System.out.println("If you want to go to < DOCTOR > page, enter D");
					System.out.println("If you want to go to < PATIENT > page, enter PA");
					System.out.println("If you want to go to < MEDICINE > page, enter M");
					System.out.println("If you want to go to < PHARMACIES > page, enter PH");
					System.out.println("If you want to schedule a treatment, enter SC");

					System.out.println("Please, enter the path for your choise!");
					
					String choise = scc.next();
						  
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
					} else if(choise.equals("br") || choise.equals("BR")) {
					} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph") && !choise.equals("SC") && !choise.equals("sc") && !choise.equals("BR") && !choise.equals("br")) {
						System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
						
						 System.out.println("Please, TRY AGAIN");
						 System.out.println();
						 choise = sc.next();
					}
				
				}
			
			}
			
	}
		
}
