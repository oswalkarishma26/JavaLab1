package com.greatlearning.departments;

public class AdminDept extends SuperDept {
	
	public String departmentName() {
		return " Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
