package com.grade.program5_1_department;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;

	public Secretary(String name, double salary, String post, int yearOfHire, int monthOfHire, int dayOfHire, double overtimeHours) {
		super(name, salary, post, yearOfHire, monthOfHire, dayOfHire);
		this.overtimeHours = overtimeHours;
	}
	public double computeSalary() {
		
		return salary+(12*overtimeHours);
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

}
