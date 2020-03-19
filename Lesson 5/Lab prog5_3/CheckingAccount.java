package com.grade.assignment5_3;

public class CheckingAccount extends Account {

	public CheckingAccount(Employee emp, double startAmount) {
		super(emp, startAmount);
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - 5.0;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

}
