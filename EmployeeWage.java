package com.bridgelabz.empwage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int fullTime = 2;
		final int partTime = 1;
		final int wagePerHr = 20;
		final int workingDays = 20;
		int dailyWage = 0;
		int totalWage = 0;
		
		for (int day = 1; day <= workingDays; day++)
		{
			System.out.println("FOR DAY " + day);
			
			int empCheck = (int) (Math.random() * 100) % 3;
			
			int FullDayHours =0;
			
			switch (empCheck)
	        {
	        case fullTime:
	        	FullDayHours = 16;
	        	dailyWage = FullDayHours * wagePerHr;
	        	System.out.println("Employee is present for full time \n And Salary is " + dailyWage);
                break;
            case partTime:
            	FullDayHours = 8;
            	dailyWage = FullDayHours * wagePerHr;
            	System.out.println("Employee is present for part time \n And Salary is " + dailyWage);
                break;
            default:
            	System.out.println("Employee is absent \n And Salary is " + dailyWage);
            	break;
            }
			
			totalWage += dailyWage;
	    }
		System.out.println("Total wage for a month is " + totalWage);
    }

}
