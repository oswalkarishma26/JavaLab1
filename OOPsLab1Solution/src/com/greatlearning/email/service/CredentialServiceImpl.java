package com.greatlearning.email.service;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;

import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generateEmailAddress(Employee emp, String dept) {
		return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+dept+".greatlearning.com";
	}

	@Override
	public char[] generatePassword() {
		Random random = new Random();
		
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%&*()_+{}?";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i<8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	}

	@Override
	public void showCredential(Employee emp, String dept) {
		System.out.println("Dear "+StringUtils.capitalize(emp.getFirstName())+", your generated credentials are as follows:");
		System.out.println("Email    -->"+generateEmailAddress(emp, dept));
		System.out.println("Password -->"+generatePassword());
		
	}

}
