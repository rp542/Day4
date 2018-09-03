package com.capgemini.day4;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double grossSalary;
	private double netSalary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public static double getPt() {
		return PT;
	}

	private double medical;
	private double hra;
	private double pf;

	public static final double PT = 200;

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calculateNetSalary() {
		hra = 0.5 * basicSalary;
		pf = 0.12 * basicSalary;
		grossSalary = hra + basicSalary + medical;
		netSalary = grossSalary - (pf + PT);
		return netSalary;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Id: " + employeeId + "\nEmployee name: " + employeeName + "\nEmployee Net salary: "
				+ netSalary);
	}

}
