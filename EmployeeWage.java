package com.bridgelabz.empwage;

public class EmployeeWage {
	public static void main(String[] args) {

		final int fullTime = 1;
		final int wagePerHr = 20;
		int fullDayHours = 0;
		int empCheck = (int) (Math.random() * 100) % 2;
		if (empCheck == fullTime) {
			System.out.println("Employee is Present");
			fullDayHours = 8;
		} else {
			System.out.println("Employee is Absent");
		}
		int wage = fullDayHours * wagePerHr;
		System.out.println("Employee Daily Wage is " + wage);
	}

}
