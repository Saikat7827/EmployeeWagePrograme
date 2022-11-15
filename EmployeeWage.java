package com.bridgelabz.empwage;

public class EmployeeWage {
	public static final int fullTime = 2;
	public static final int partTime = 1;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHours;
	private int totalEmpWage;

	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHours = maxHours;
	}
	@Override
	public String toString() {
		return "Company Name : " + company + " Employee rate per hour : " + empRatePerHour
				+ " Number of working Days : " + numOfWorkingDays + " Max working hours per month : " + maxHours
				+ " Total Employee Wage for company " + company + " is: " + totalEmpWage;
	}

	public void computeEmpWage() {
		
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem using Oops concepts");
		EmployeeWage apple = new EmployeeWage("Apple", 25, 22, 100);
		EmployeeWage samsung = new EmployeeWage("Samsung", 40, 25, 200);
		apple.computeEmpWage();
		System.out.println(apple);
		samsung.computeEmpWage();
		System.out.println(samsung);
	}

}
