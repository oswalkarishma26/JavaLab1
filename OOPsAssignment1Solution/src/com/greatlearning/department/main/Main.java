package com.greatlearning.department.main;

import com.greatlearning.departments.AdminDept;
import com.greatlearning.departments.HrDept;
import com.greatlearning.departments.SuperDept;
import com.greatlearning.departments.TechDept;

public class Main {

	public static void main(String[] args) {
		
		SuperDept superDept = new SuperDept();
		AdminDept adminDept = new AdminDept();
		HrDept hrDept = new HrDept();
		TechDept techDept = new TechDept();
		
		adminDept.departmentName();
		adminDept.getTodaysWork();
		adminDept.getWorkDeadline();
		superDept.isTodayHoliday();
		
		System.out.println();
		
		hrDept.departmentName();
		hrDept.doActivity();
		hrDept.getTodaysWork();
		hrDept.getWorkDeadline();
		superDept.isTodayHoliday();
		
		System.out.println();
		
		techDept.departmentName();
		techDept.getTodaysWork();
		techDept.getWorkDeadline();
		techDept.getTechStackInformation();
		superDept.isTodayHoliday();
	}

}
