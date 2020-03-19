package lab4_1;

public class Main {
	
	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		employee[0] = new Employee("Carl",75000,1987, 12,15);
		employee[1] = new Employee("Harry", 50000, 1989, 10, 1);
		employee[2] = new Employee("Tony", 40000, 1990, 3, 15);
		
		for(Employee e : employee) {
			System.out.printf("\nname = %s, salary = $%,.2f, hire day = %tc",e.getName(), e.getSalary(), e.getHireDay());
		}
		
		System.out.println("\n");
		for(Employee e: employee) {
			
			double tax = e.yearlyFederalTax(e.getSalary());
			System.out.printf("%s tax is $%,.2f \n",e.getName(), tax);
		}
		
		Account[] acc = new Account[3];
		acc[0] = new Account(employee[0], AccountType.CHECKING,300.00);
		acc[1] = new Account(employee[1], AccountType.RETIREMENT,300.00);
		acc[2] = new Account(employee[2], AccountType.SAVINGS,300.00);
		
		System.out.println("\n");
		for(Account a: acc) {
			System.out.println(a.toString());
		}
		
//		System.out.println("ACC DATA: "+acc1.toString());
//		System.out.println("ACC DATA: "+acc2.toString());
//		System.out.println("ACC DATA: "+acc3.toString());
	}
}
