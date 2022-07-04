package addressBook;

import java.util.Scanner;

public class addressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to address book ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String fName = scanner.nextLine();
		System.out.println("Enter last name");
		String lName = scanner.nextLine();
		System.out.println("Enter city name");
		String city = scanner.nextLine();
		System.out.println("Enter state");
		String state = scanner.nextLine();
		System.out.println("Enter zip");
		int zip = scanner.nextInt();
		System.out.println("Enter phone number");
		int pNumber = scanner.nextInt();
		System.out.println("Enter email");
		String email = scanner.nextLine();

		Contacts contact = new Contacts(fName, lName, city, state, zip, pNumber, email);
	}

}
