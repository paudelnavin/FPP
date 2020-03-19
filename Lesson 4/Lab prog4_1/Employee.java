package lab4_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String name, double aSalary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	// needs to be improved
	public Date getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public double yearlyFederalTax(double salary) {

		if(salary<=26000) {
			return 0.0;
		}else if(salary>26000 && salary<=50000) {
			return (salary*20)/100;
		}else if(salary>50000 && salary<=80000) {
			return (salary*24)/100;
		}else if(salary>80000) {
			return salary*(28.0/100);
		}
		
		return salary;
	}
}
