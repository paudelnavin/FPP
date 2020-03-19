package com.grade.program5_1_department;

import java.util.Scanner;

public class MainClass {
		
	DeptEmployee[] department = null;
	
	public static void main(String[] args) {
	    new MainClass();		
	}
	MainClass(){
		
        department = new DeptEmployee [5];
        department[0] = new Professor("Navin", 40000, "professor", 1997, 12, 14, 10);
        department[1] = new Professor("Bishwash",28000, "professor", 1995, 4, 11, 10);
        department[2] = new Professor("Pradip", 58000, "professor", 2001, 3, 01, 10);	
        department[3] = new Secretary("Ram", 22000, "secretary", 2007, 11, 16, 200);
        department[4] = new Secretary("Shyam", 10000, "secretary", 2015, 8, 22, 200);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See the sum of all salaries in the department? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			System.out.printf("Sum of all salaries in the department : $%,.2f",getSumOfEmployeesSalaries(department));
		}
		else {
			System.out.println("Exit from Program Success");
		}
		
		
		System.out.print("\nWould like to search for the details of an employee.(y/n) ");
		String answer1 = sc.next();
		if(answer1.equalsIgnoreCase("y")){
			System.out.println("Please enter name of an employee: ");
			String answer2 = sc.next();
			boolean isFound=false;
			for(DeptEmployee deptEmployee : department) {
			    if(deptEmployee.getName().equalsIgnoreCase(answer2)) {
			    	System.out.printf("\nACCOUNT INFO FOR %s \nSalary : $%,.2f \nPost: %s \nHire Date: %tc",deptEmployee.getName(),
			    			deptEmployee.computeSalary(),deptEmployee.getPost(),deptEmployee.getHireDate());
                    isFound=true;
			    	break;			    
			    }
			}
			if(isFound==false)
			      System.out.println("Not Found");
		}else {
			System.out.println("Exit from Program Success");
		}
		
		sc.close();
	}
	
	public static double getSumOfEmployeesSalaries(DeptEmployee[] department) {
		
		double total = 0;
		for (DeptEmployee deptEmployee : department) {
			total = total + deptEmployee.computeSalary();
		}
		return total;
	}
}
		