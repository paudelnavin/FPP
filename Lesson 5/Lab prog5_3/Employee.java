package com.grade.assignment5_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {

//	private AccountList accounts = new AccountList();
	private ArrayList<Account> accountList = new ArrayList<>();
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		setHireDate(cal.getTime());
	}

	public String getName() {
		return this.name.toUpperCase();
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public List<String> getNamesOfAccounts() {
		ArrayList<String> namesOfAccounts = new ArrayList<>();
		
		for(Account e : accountList) {
			namesOfAccounts.add(e.getAcctType().toString());
		}

		return namesOfAccounts;
	}

	public void createNewChecking(double startAmount) {
		// implement
		CheckingAccount checkAcct = new CheckingAccount(this, startAmount);
		accountList.add(checkAcct);
	}		

	public void createNewSavings(double startAmount) {
		// implement
		SavingAccount acct = new SavingAccount(this, startAmount);
		accountList.add(acct);

	}

	public void createNewRetirement(double startAmount) {
		// implement

		RetirementAccount retireAcct = new RetirementAccount(this, startAmount);
		accountList.add(retireAcct);
	}

	public String getFormattedAcctInfo() {
		// implement
		String output = "";
		for(Account e : accountList) {
			output += e.toString();
		}
		
		return output;

	}

	public void deposit(int acctIndex, double amt) {
		// implement
		this.accountList.get(acctIndex).makeDeposit(amt);
	}

	public void withdraw(int acctIndex, double amt) {
		// implement
		Account selectedAcct = accountList.get(acctIndex);

		selectedAcct.makeWithdrawal(amt);

	}

}
