package addressBook;

import java.util.Scanner;

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		addressBook ab = new addressBook();
		ab.addContact();
		ab.displayContact();
		
		System.out.println("Enter 1 to edit contact /n 2 to display contact /n 3 to delete contact /n 4 to exit program");
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1 :
			ab.editContact();
			break;
		case 2 :
			ab.displayContact();
			break;
		case 3:
			ab.deleteContact();
		case 4 :
			System.out.print("Program is exitting");
		}


	}

}
