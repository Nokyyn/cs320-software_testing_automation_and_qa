/* 
 * Author: Nicholas Enquist
 * Date: 03/21/2022
 * Course ID: CS-320-T4517 (22EW4)
 * Description: Contact Service TEST for CS-320 mobile app project
 * 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.snhu.CS320Project.ContactService;

class ContactServiceTest {
	
	ContactService service = new ContactService();
	

	@Test
	void testAddContactIDExists() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.addContact("1");});
	}
	
	@Test
	void testRemoveContactIDDoesNotExist() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.removeContact("2");});
	}
	
	@Test
	void testUpdateContactFirstNameIDDoesNotExist() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.updateContactFirstName("2");});
	}
	
	@Test
	void testUpdateContactLastNameIDDoesNotExist() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.updateContactLastName("2");});
	}
	
	@Test
	void testUpdateContactPhoneIDDoesNotExist() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.updateContactPhone("2");});
	}
	
	@Test
	void testUpdateContactAddressIDDoesNotExist() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {service.updateContactAddress("2");});
	}




}
