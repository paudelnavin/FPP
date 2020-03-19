package lab4_1;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "name = "+employee.getName()+" type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount<=balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return balance;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	
}
