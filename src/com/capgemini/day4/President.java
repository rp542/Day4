package com.capgemini.day4;

public class President extends Employee {
	private double kilometerTravelled;
	private double tourAllowance;
	public static final double telephoneAllowance = 2000;

	public President() {

	}

	public President(double kilometerTravelled, double tourAllowance) {
		super();
		this.kilometerTravelled = kilometerTravelled;
		this.tourAllowance = tourAllowance;
	}

	public President(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}

	public double getKilometerTravelled() {
		return kilometerTravelled;
	}

	public void setKilometerTravelled(double kilometerTravelled) {
		this.kilometerTravelled = kilometerTravelled;
	}

	public double getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(double tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public static double getTelephoneallowance() {
		return telephoneAllowance;
	}

	@Override
	public double calculateNetSalary() {
		setHra(0.5 * getBasicSalary());
		setPf(0.12 * getBasicSalary());

		tourAllowance = (0.08 * kilometerTravelled) * getBasicSalary();

		setGrossSalary(getHra() + getBasicSalary() + getMedical() + tourAllowance + telephoneAllowance);
		setNetSalary(getGrossSalary() - (getPf() + PT));
		return getNetSalary();

	}
}
