package com.grade.objectandclass4_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.setName(name);
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		setHireDate(cal.getTime());
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this,AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		if(acctType.equals(AccountType.CHECKING)) {
			checkingAcct.makeDeposit(amt);
		}else if(acctType.equals(AccountType.SAVINGS)) {
			savingsAcct.makeDeposit(amt);
		}else if(acctType.equals(AccountType.RETIREMENT)) {
			retirementAcct.makeDeposit(amt);
		}
		
	}
	public boolean withdraw(AccountType acctType, double amt){
		if(acctType.equals(AccountType.CHECKING)) {
			return checkingAcct.makeWithdrawal(amt);
			
		}
		if(acctType.equals(AccountType.SAVINGS)) {
			return savingsAcct.makeWithdrawal(amt);
		}
		if(acctType.equals(AccountType.RETIREMENT)) {
			return retirementAcct.makeWithdrawal(amt);
		}
		
		
		return false;
		
	}

	public String getFormattedAcctInfo() {
		String info="";
		
		if(checkingAcct != null) {
		     info += "\nAccount type: checking\n Current balance: $"+String.format("%,.2f", checkingAcct.getBalance());

		}
		if(savingsAcct != null) {
			info += "\nAccount type: savings\n Current balance: $"+String.format("%,.2f", savingsAcct.getBalance());
			
			
		}
		if(retirementAcct != null) {
			info += "\nAccount type: retirement\n Current balance: $"+String.format("%,.2f", retirementAcct.getBalance());
		}
		
		return info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getSavingsAcct() {
		return savingsAcct;
	}

	public void setSavingsAcct(Account savingsAcct) {
		this.savingsAcct = savingsAcct;
	}

	public Account getCheckingAcct() {
		return checkingAcct;
	}

	public void setCheckingAcct(Account checkingAcct) {
		this.checkingAcct = checkingAcct;
	}

	public Account getRetirementAcct() {
		return retirementAcct;
	}

	public void setRetirementAcct(Account retirementAcct) {
		this.retirementAcct = retirementAcct;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
