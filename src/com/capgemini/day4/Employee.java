package com.capgemini.day4;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeePhone;
	private double basicSalary;
	public final double specialAllowance = 250.80;
	public final double hra=1000.50;
	double salary;
	public Employee() {
		
	}
	public Employee (int employeeId,String employeeName,String employeeAddress,int employeePhone,double basicSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
		this.basicSalary=basicSalary;
	}
	public double calculateSalary() {
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		return salary;
		
	}
}
