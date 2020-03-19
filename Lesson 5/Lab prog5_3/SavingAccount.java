package com.grade.assignment5_3;

public class SavingAccount extends Account {
	private final double INTEREST_RATE=0.25;
	
	public SavingAccount (Employee emp, double startAmount) {
		super(emp,startAmount);
		}
	@Override
	public double getBalance() {
		double interest= INTEREST_RATE/100.0*super.getBalance();
		return super.getBalance()+interest;
		
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
}