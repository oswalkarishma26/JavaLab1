package com.greatlearning.departments;

public class HrDept extends SuperDept{
	
	public String departmentName() {
		System.out.println("  Welcome to HR Department");
		return " HR Department";
	}
	
	public String getTodaysWork() {
		System.out.println(" Fill today’s worksheet and mark your attendance");
		return " Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		System.out.println(" Complete by EOD");
		return " Complete by EOD";
	}
	
	public String doActivity() {
		System.out.println(" team lunch");
		return "team lunch";
	}

}
