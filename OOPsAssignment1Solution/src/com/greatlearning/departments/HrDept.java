package com.greatlearning.departments;

public class HrDept extends SuperDept{
	
	public String departmentName() {
		return " HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team lunch";
	}

}
