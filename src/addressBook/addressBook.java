package addressBook;

import java.util.Scanner;

public class addressBook {

	Contacts contact;
	Scanner scanner = new Scanner(System.in);
	
	public void addContact(){
		
		contact = new Contacts();
		
		System.out.println("Enter first name");
		String fName = scanner.nextLine();
		contact.setfName(fName);
		System.out.println("Enter last name");
		String lName = scanner.nextLine();
		contact.setlName(lName);
		System.out.println("Enter city name");
		String city = scanner.nextLine();
		contact.setCity(city);
		System.out.println("Enter state");
		String state = scanner.nextLine();
		contact.setState(state);
		System.out.println("Enter zip");
		int zip = scanner.nextInt();
		contact.setZip(zip);
		System.out.println("Enter phone number");
		int pNumber = scanner.nextInt();
		contact.setPhoneNumber(pNumber);
		System.out.println("Enter email");
		String email = scanner.next();
		contact.setEmail(email);
		
	}
	
	public void displayContact(){
		if ( contact != null ){
			System.out.println("First name : "+contact.getfName());
			System.out.println("Last name : "+contact.getlName());
			System.out.println("City : "+contact.getCity());
			System.out.println("Zip : "+contact.getZip());
			System.out.println("Phone Number : "+contact.getPhoneNumber());
			System.out.println("Email : "+contact.getEmail());
		}
		else{
			System.out.print("Contact is not present");
		}
	}
	
	public void editContact(){
		System.out.println("Enter the first name of the contact to be edited");
		String name = scanner.next();
		if(name.equalsIgnoreCase(contact.getfName())){
			System.out.println("Enter last name");
			String lName = scanner.next();
			contact.setlName(lName);
			System.out.println("Enter city name");
			String city = scanner.next();
			contact.setCity(city);
			System.out.println("Enter state");
			String state = scanner.next();
			contact.setState(state);
			System.out.println("Enter zip");
			int zip = scanner.nextInt();
			contact.setZip(zip);
			System.out.println("Enter phone number");
			int pNumber = scanner.nextInt();
			contact.setPhoneNumber(pNumber);
			System.out.println("Enter email");
			String email = scanner.next();
			contact.setEmail(email);
		}
	}
	
	public void deleteContact(){
		contact = null;
	}

}
