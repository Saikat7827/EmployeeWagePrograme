package com.bridgelabz.empwage;

public class EmployeeWage {
	public static final int fullTime = 2;
	public static final int partTime = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		EmployeeWage apple = new EmployeeWage();
		apple.computeEmpWage("Apple", 25, 22, 100);
		EmployeeWage samsung = new EmployeeWage();
		samsung.computeEmpWage("Samsung", 40, 25, 200);
	}

	public int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
		
		int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
		
		while (totalEmpHrs < maxHours && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case partTime:
				empHrs = 4;
				break;
			case fullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Company Name : " + company);
		System.out.println("Employee rate per hour : " + empRatePerHour);
		System.out.println("Number of working Days : " + numOfWorkingDays);
		System.out.println("Max working hours per month : " + maxHours);
		System.out.println("Total Employee Wage for company " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

}
