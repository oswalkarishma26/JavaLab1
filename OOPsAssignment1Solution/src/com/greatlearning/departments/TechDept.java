package com.greatlearning.departments;

public class TechDept extends SuperDept{
	
	public String departmentName() {
		System.out.println("  Welcome to Tech Department ");
		return " Tech Department ";
	}
	
	public String getTodaysWork() {
		System.out.println(" Complete coding of Module 1");
		return " Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		System.out.println(" Complete by EOD");
		return " Complete by EOD";
	}
	
	public String getTechStackInformation() {
		System.out.println(" Core Java");
		return "Core Java";
	}

}
