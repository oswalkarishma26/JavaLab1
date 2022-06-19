package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		
			CredentialService credService = new CredentialServiceImpl();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Please enter First Name :");
			String firstName = sc.next();
			System.out.println("Please enter Last Name :");
			String lastName = sc.next();
			
			Employee emp = new Employee(firstName,lastName);
			
			System.out.println("Please enter the department from the following:");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			int num = sc.nextInt();
			String dept=null;
			
			switch(num){	
				case 1: dept = "tech";
						credService.showCredential(emp,dept);
						break;
				case 2: dept = "admin";
						credService.showCredential(emp,dept);
						break;
				case 3: dept = "humanresource";
						credService.showCredential(emp,dept);
						break;
				case 4: dept = "legal";
						credService.showCredential(emp,dept);
						break;
				default: System.out.println("Please enter correct option");	
			}
			
	}

}
