package com.grade.program5_1_department;

public class Professor extends DeptEmployee {
	
	private int numberOfPublications;
	
	public Professor(String name, double salary, String post, int yearOfHire, int monthOfHire, int dayOfHire, int numberOfPublications) {
		super(name, salary, post, yearOfHire, monthOfHire, dayOfHire);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
