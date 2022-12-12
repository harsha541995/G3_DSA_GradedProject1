package Main;

import subsidaryClasses.*;

public class Main {
	
	public static void main(String[] args) {
		admin Admin1 = new admin();
		HR HR1 = new HR();
		tech tech1 = new tech();
		
		//Admin department
		String x = "Welcome to "+Admin1.departmentName();
		System.out.println(x);		
		
		x = Admin1.getTodaysWork();
		System.out.println(x);
		
		x = Admin1.getWorkDeadline();
		System.out.println(x);
		
		x = Admin1.isTodayAHoliday();
		System.out.println(x);
		
		System.out.println("");
		
		//HR DEPARTMENT
		
		 x = "Welcome to "+HR1.departmentName();
		System.out.println(x);
		
		 x = HR1.doActivity();
		System.out.println(x);
		
		x = HR1.getTodaysWork();
		System.out.println(x);
		
		x = HR1.getWorkDeadline();
		System.out.println(x);
		
		x = HR1.isTodayAHoliday();
		System.out.println(x);
		
		System.out.println("");

		
		//TECH DEPARTMENT
		
		 x = "Welcome to "+tech1.departmentName();
		System.out.println(x);
		
		 x = tech1.getTechStackInformation();
		System.out.println(x);
		
		x = tech1.getTodaysWork();
		System.out.println(x);
		
		x = tech1.getWorkDeadline();
		System.out.println(x);
		
		x = tech1.isTodayAHoliday();
		System.out.println(x);
		
		System.out.println("");
		
		
	}

}
