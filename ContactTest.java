/* 
 * Author: Nicholas Enquist
 * Date: 03/21/2022
 * Course ID: CS-320-T4517 (22EW4)
 * Description: Contact TEST for CS-320 mobile app project
 * 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.snhu.CS320Project.Contact;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("1234", "Slarti", "Bartfast", "5558675309", "42 Meaningful Way");
		assertTrue(contact.getContactID().equals("1234"));
		assertTrue(contact.getFirstName().equals("Slarti"));
		assertTrue(contact.getLastName().equals("Bartfast"));
		assertTrue(contact.getPhone().equals("5558675309"));
		assertTrue(contact.getAddress().equals("42 Meaningful Way"));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("12345678912", "John", "Smith", 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact(null, "John", "Smith", 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "Slartibartfast", "Smith", 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", null, "Smith", 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", "Slartibartfast", 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", null, 
				"5558675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactPhoneNotTenCharacters() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", "Smith", 
				"8675309", "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", "Smith", 
				null, "21 Havarti Lane");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", "Smith", 
				"5558675309", "It is a dark time for the Rebellion. Although the Death Star has been destroyed, "
						+ "Imperial Troops have driven the Rebel forces from their hidden base and pursued them "
						+ "across the galaxy. Evading the dreaded Imperial Starfleet, a group of freedom fighters "
						+ "led by Luke Skywalker have established a new secret base on the remote ice world of Hoth. "
						+ "The evil lord Darth Vader, obsessed with finding young Skywalker, has dispatched thousands "
						+ "of remote probes into the far reaches of space...");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new Contact("1234", "John", "Smith", 
				"5558675309", null);
		});
	}
	
	@Test
	void testSetAddress() {
		Contact test = new Contact("1234", "Slarti", "Bartfast", "5558675309", "42 Meaningful Way");
		test.setAddress("Test");
	}
	
}
