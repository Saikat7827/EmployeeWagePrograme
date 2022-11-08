package com.bridgelabz.empwage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int fullTime = 2;
		final int partTime = 1;
		final int wagePerHr = 20;
		int fullDayHr = 0;
		
	    int empCheck = (int) (Math.random() * 100) % 3;
	    if (empCheck == fullTime)
	    {
            System.out.println("Employee is Present Full time");
            fullDayHr = 16;
        } else if (empCheck == partTime)
        {
            System.out.println("Employee is Present Part time");
            fullDayHr = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
	    
	    int wage = fullDayHr * wagePerHr;
	    System.out.println("Employee Daily Wage is " + wage);
	}

}
