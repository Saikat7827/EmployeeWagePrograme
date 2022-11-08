package com.bridgelabz.empwage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int fullTime = 2;
		final int partTime = 1;
		final int wahePerHr = 20;
		int fullDayHr = 0;
		
	    int empCheck = (int) (Math.random() * 100) % 3;
	    
	    switch (empCheck)
        {
            case fullTime:
                System.out.println("Employee is Present Full time");
                fullDayHr = 16;
                break;
            case partTime:
                System.out.println("Employee is Present Part time");
                fullDayHr = 8;
                break;
            default:
                System.out.println("Employee is Absent");
        }
	    
	    int wage = fullDayHr * wahePerHr;
	    System.out.println("Employee Daily Wage is " + wage);
	}

}
