/* 
 * Author: Nicholas Enquist
 * Date: 03/21/2022
 * Course ID: CS-320-T4517 (22EW4)
 * Description: Contact class for CS-320 mobile app project
 */

package com.snhu.CS320Project;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// constructor: 
	// fields cannot be null; contactID, firstName and lastName can be no more than 10 characters in length
	// phone must be exactly 10 characters in length; address may be no more than 30 characters
	public Contact(String contactID, String firstName, String lastName,
			String phone, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID (must be 10 characters, or less)");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name (must be 10 characters, or less)");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name (must be 10 characters, or less)");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number (must be exactly 10 characters)");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address (must be 30 characters, or less)");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// update firstName, validate input is not null or greater than 10 characters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name (must be 10 characters, or less)");
		}
		this.firstName = firstName;
		System.out.println("First name updated!");
	}
	
	// update lastName, validate input is not null or greater than 10 characters
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name (must be 10 characters, or less)");
		}
		this.lastName = lastName;
		System.out.println("Last name updated!");
	}
	
	// update phone, validate input is not null or NOT exactly 10 characters
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number (must be exactly 10 characters)");
		}
		this.phone = phone;
		System.out.println("Phone number updated!");
	}
	
	// update address, validate input is not null or greater than 30 characters
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address (must be 30 characters, or less)");
		}
		this.address = address;
		System.out.println("Address updated!");
	}
	
	// override toString() to print formatted contact info
	@Override
	public String toString() {
		return firstName + " " + lastName + " | " + phone + " | " + address;
	}

}
