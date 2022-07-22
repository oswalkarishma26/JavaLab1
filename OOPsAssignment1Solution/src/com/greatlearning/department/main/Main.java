package com.greatlearning.department.main;

import com.greatlearning.departments.AdminDept;
import com.greatlearning.departments.HrDept;
import com.greatlearning.departments.SuperDept;
import com.greatlearning.departments.TechDept;

public class Main {

	public static void main(String[] args) {
		
		AdminDept adminDept = new AdminDept();
		HrDept hrDept = new HrDept();
		TechDept techDept = new TechDept();
		
		System.out.println(" Welcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayHoliday());
		
		System.out.println();
		
		System.out.println(" Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayHoliday());
		
		System.out.println();
		
		System.out.println(" Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayHoliday());
	}

}
