package com.capgemini.day4;

public class SalesManager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public SalesManager(double petrolAllowance, double foodAllowance, double otherAllowance) {
		super();
		this.petrolAllowance = petrolAllowance;
		this.foodAllowance = foodAllowance;
		this.otherAllowance = otherAllowance;
	}

	public SalesManager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);

	}

	@Override
	public double calculateNetSalary() {
		setHra(0.5 * getBasicSalary());
		setPf(0.12 * getBasicSalary());
		petrolAllowance = 0.08 * getBasicSalary();
		foodAllowance = 0.13 * getBasicSalary();
		otherAllowance = 0.03 * getBasicSalary();
		setGrossSalary(getHra() + getBasicSalary() + getMedical() + petrolAllowance + foodAllowance + otherAllowance);
		setNetSalary(getGrossSalary() - (getPf() + getPt()));
		return getNetSalary();

	}

	public SalesManager() {
		super();

	}

}
