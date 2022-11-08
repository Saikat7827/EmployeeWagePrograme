package com.bridgelabz.empwage;

public class EmployeeWage {
	public static final int fullTime = 2;
	public static final int partTime = 1;
	public static final int wagePrHr = 20;
	public static final int workingDays = 20;
	public static final int maxWorkingHrs = 100;

	public static void main(String[] args) {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays < workingDays) {
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
			System.out.println("For Day" + totalWorkingDays + " : Employee Maximum Working Hours are " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * wagePrHr;
		System.out.println("Total Employee Wage for month is " + totalEmpWage);
	}

}
