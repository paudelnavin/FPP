package com.grade.objectandclass4_2;

public class Account {
	
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
   
	//Constructor
	Account(Employee emp, AccountType acctType, double balance){
	
	this.acctType =acctType;
	this.balance = balance;
	}

	//Constructor
	Account(Employee emp, AccountType acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	
//	public String toString() {
//	return "Name = "+employee.getName()+", type = "+acctType+", balance = "+balance;
//	}
	
	public void makeDeposit(double deposit) {
			balance += deposit;
	}
	
	public boolean makeWithdrawal(double amount) {
		
		if(balance>amount)
			return true;
		
		return false;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public AccountType getAccountType() {
		return acctType;
	}
	
	public double computeInterest() {
		double interest;
		
		if(acctType == AccountType.CHECKING){
			interest  =  balance * 0.02;
		
			return interest;
		}
		else if(acctType == AccountType.SAVINGS){
			interest  =  balance * 0.04;
			
			return interest;
		}
		else if(acctType == AccountType.RETIREMENT){
			interest  =  balance * 0.05;
			
			return interest;
		}
		
		return 0.0;
	}
	
}
