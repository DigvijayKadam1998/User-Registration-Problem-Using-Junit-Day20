package com.bridgelabz.junittesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration(); 
	
	@Test
	public void givenName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Digvijay");
		assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Kadam");
		assertEquals(true, result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("digvijaykadam16@gmail.com");
		assertEquals(true, result);
	}
}
