package com.bridgelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	String userFirstName = "^[A-Z][a-zA-Z]{3,}";
	
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
}
