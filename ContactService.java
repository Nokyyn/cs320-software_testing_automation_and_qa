/* 
 * Author: Nicholas Enquist
 * Date: 03/21/2022
 * Course ID: CS-320-T4517 (22EW4)
 * Description: Contact Service class for CS-320 mobile app project
 *  
 * UPDATE: 04/04/2022
 * Removed all extraneous, commented-out code
 * Added contactIDPrompt() and changed all service methods to require a contactID parameter, in keeping
 * with the other Service class structures
 * 
 */

package com.snhu.CS320Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContactService {
	
	// instantiate class variables
	// FIXME: Remove testContact declaration and references before going live
	Contact testContact = new Contact("1", "John", "Smith", "5558675309", "123 Testing Drive");  // contact for testing purposes
	private ArrayList<Contact> contactList = new ArrayList<Contact>(Arrays.asList(testContact));  // instantiate array with test contact
	Scanner scnr = new Scanner(System.in);

	// prompt user for contact ID and return ID to calling function
	// pass this function as the argument to the other task functions to supply the necessary contactID
	public String contactIDPrompt() {
		String contactID;
		System.out.print("Enter Contact ID: ");
		contactID = scnr.nextLine();
		return contactID;
	}
	
	// method to add new contact by contact ID; contact IDs must be unique
	public void addContact(String contactID) {
		
		// verify contact does not already exist
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				throw new IllegalArgumentException("Contact ID already exists!");
			}
		}
		
		// if contact ID did not exist, get new contact info
		String firstName = "";
		String lastName = "";
		String phone = "";
		String address = "";
		
		System.out.print("Enter first name: ");
		firstName = scnr.nextLine();
		System.out.print("Enter last name: ");;
		lastName = scnr.nextLine();
		System.out.print("Enter 10-digit phone number: ");
		phone = scnr.nextLine();
		System.out.print("Enter address: ");
		address = scnr.nextLine();
		
		// create new contact and add to contactList
		Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
		contactList.add(newContact);
		
		System.out.print("\n\n");
	}
	
	public void removeContact(String contactID) {
		
		// attempt to locate contact; delete if found and alert user
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.remove(i);
				System.out.println("Contact deleted!\n\n");
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not found!");
	}
	
	public void updateContactFirstName(String contactID) {
		String userInput = "";
		
		// attempt to locate and update contact first name
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				System.out.print("Enter new First Name: ");
				userInput = scnr.nextLine();
				contactList.get(i).setFirstName(userInput);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not found!");
	}
	
	public void updateContactLastName(String contactID) {
		String userInput = "";
		
		// attempt to locate and update contact first name
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				System.out.print("Enter new Last Name: ");
				userInput = scnr.nextLine();
				contactList.get(i).setLastName(userInput);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not found!");
	}
	
	public void updateContactPhone(String contactID) {
		String userInput = "";

		// attempt to locate and update contact first name
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				System.out.print("Enter new Phone Number: ");
				userInput = scnr.nextLine();
				contactList.get(i).setPhone(userInput);
				return;
			}
		}
		//System.out.println("Contact not found.\n\n");
		throw new IllegalArgumentException("Contact ID not found!");
	}
	
	public void updateContactAddress(String contactID) {
		String userInput = "";

		// attempt to locate and update contact first name
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				System.out.print("Enter new Address: ");
				userInput = scnr.nextLine();
				contactList.get(i).setAddress(userInput);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not found!");
	}

}
