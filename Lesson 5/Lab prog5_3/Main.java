package com.grade.assignment5_3;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts.\n" + 
				"B. Make a deposit.\n" + 
				"C. Make a withdrawal.\n" + 
				"Make a selection (A/B/C): ");
		String answer = sc.next();
		
		
		if(answer.equalsIgnoreCase("A")){
			
			
			String info = getFormattedAccountInfo(emps);
			System.out.println(info);
		}
		if (answer.equalsIgnoreCase("B")) {
			
			
			String output="";
			for(int i=0;i<emps.length;i++) {
				output+=String.format("%n%d. %s", i,emps[i].getName());
			}
			output+="\nSelect an Employee: (type a number) ";
			System.out.println(output);
			
			int empChoice = sc.nextInt();
			String info ="";
			Employee currentEmp = emps[empChoice];
			for (int i=0;i<currentEmp.getNamesOfAccounts().size();i++) {
				info+=i+". "+currentEmp.getNamesOfAccounts().get(i)+"\n";
			}
			System.out.println(info+"Select Account: (type a number) ");
			
			int accChoice = sc.nextInt();
			
			System.out.println("Deposit Amount: ");
			int depositAmount = sc.nextInt();
			currentEmp.deposit(accChoice, depositAmount);
					
		}
		if (answer.equalsIgnoreCase("C")) {
			String output="";
			for(int i=0;i<emps.length;i++) {
				output+=String.format("%n%d. %s", i,emps[i].getName());
			}
			output+="\nSelect an Employee: (type a number) ";
			System.out.println(output);
			
			int empChoice = sc.nextInt();
			String info ="";
			Employee currentEmp = emps[empChoice];
			for (int i=0;i<currentEmp.getNamesOfAccounts().size();i++) {
				info+=i+". "+currentEmp.getNamesOfAccounts().get(i)+"\n";
			}
			System.out.println(info+"Select Account: (type a number) ");
			
			int accChoice = sc.nextInt();
			
			System.out.println("Withdraw Amount: ");
			double withdrawAmount = sc.nextInt();
			currentEmp.withdraw(accChoice, withdrawAmount);
		}
		
		sc.close();
	}
	String getFormattedAccountInfo(Employee[] arr){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		String output="";
		for(Employee e: emps) {
			output+=String.format("%n%nACCOUNT INFO FOR %s%n%n",e.getName());
			output+=e.getFormattedAcctInfo();
		}
		return output;
	}
}
