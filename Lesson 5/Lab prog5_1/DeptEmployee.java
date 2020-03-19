package com.grade.program5_1_department;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
	
	private String name;
	private Date hireDate;
	double salary;
	private String post;
	
	public DeptEmployee(String name, double salary, String post, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.salary = salary;
		this.post = post;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		setHireDate(cal.getTime());
	}
	
	public double computeSalary() {
	
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
