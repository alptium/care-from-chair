package healthcare;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		try(Scanner sc = new Scanner(System.in)) {
		
		/*System.out.println("Welcome to Healthcare application");
		System.out.println("Now, you'll have to choose the option you need!");
		System.out.println("If you want to go to < DOCTOR > page, enter D");
		System.out.println("If you want to go to < PATIENT > page, enter PA");
		System.out.println("If you want to go to < MEDICINE > page, enter M");
		System.out.println("If you want to go to < PHARMACIES > page, enter PH");
		
		System.out.println("Please, enter the path for your choise!");
		

		
		String choise = sc.next();
		
		if(choise.equals("D") && choise.equals("d")) {
			 //runDemoDoctor(); 
		} else if(choise.equals("PA") && choise.equals("pa") ) {
			//runDemoPatient();
		} else if(choise.equals("M") && choise.equals("m")) {
			//runDemoMedicine();		
		} else if(choise.equals("PH") && choise.equals("ph")) {
			//runDemoPharmacies();
		} else while (!choise.equals("D") && !choise.equals("d") && !choise.equals("PA") && !choise.equals("pa") && !choise.equals("M") && !choise.equals("m") && !choise.equals("PH") && !choise.equals("ph")) {
			System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
			
			System.out.println("Please, TRY AGAIN");
			System.out.println();
			choise = sc.next();
		}	*/
			
			//Zadatak za Tamaru
			// 
		runDemoDoctor();
			
			// 
		//runDemoPatient();
			
			//Zadatak za Gorana
		//runDemoMedicine();
			
			//Zadatak za Katarinu
		//runDemoPharmacies();
			
			/* Ovaj prvi deo je komentarisan  posto nisam jos
			 * uvek zavrsila pa da vas ne ometa dok proveravate svoj kod.Uklonite komendar sa svog runDemo-a 
			 * da biste mogli da radite(Kao sto je runDemoDoctor).
			*/
			
		}
		
		}
	
		
		private static void runDemoDoctor() {
			System.out.println("Welcome to the page DOCTOR");

		}
		private static void runDemoPatient() {
			System.out.println("Welcome to the page PATIENT");

		}
		private static void runDemoMedicine() {
			System.out.println("Welcome to the page MEDICINE");

		}
		private static void runDemoPharmacies() {
			System.out.println("Welcome to the page PHARMACIES");

		}
}
	
