package com.bridgelabz.empwage;

public class CompanyWage {
	  public final String company;
	    public final int empRatePerHour;

	    public  int numOfWorkingDays;
	    public  int maxHoursPerMonth;

	    public int totalEmpWage;
	    public int maxHoursInMonth;

	    public CompanyWage(String company , int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
	       this.company=company;
	       this.empRatePerHour=empRatePerHour;
	       this.maxHoursPerMonth=maxHoursPerMonth;
	       this.maxHoursPerMonth=maxHoursPerMonth;
	    }
	    public void setTotalEmpWage(int i){
	        this.totalEmpWage=totalEmpWage;
	    }

	    @Override
	    public String toString() {
	        return "CompanyEmpWage{" +
	                "company='" + company + '\'' +
	                ", empRatePerHour=" + empRatePerHour +
	                ", numOfWorkingDays=" + numOfWorkingDays +
	                ", maxHoursPerMonth=" + maxHoursPerMonth +
	                ", totalEmpWage=" + totalEmpWage +
	                '}';
	    }
}
