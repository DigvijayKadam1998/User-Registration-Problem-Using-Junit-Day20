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
	
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9999999999");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("digvijaykadam");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Digvijaykadam");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("Digvijay123");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("Digvijay@123");
		assertEquals(true, result);
	}
	
	 @Test
	    public void givenEmail1_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
	        assertEquals(true, result);
	    }
}
