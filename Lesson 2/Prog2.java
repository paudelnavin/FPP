package lab;

public class Prog2 {

	public static void main(String[] args) {
		calculation();
	}

	private static void calculation() {
		float num1=(float) 1.27,num2=(float) 3.881,num3=(float) 9.6;
		 int sum = (int)(num1+num2+num3);
		 System.out.println("Sum in integer is "+ sum);
		 int roundsum=(int)(Math.round(num1+num2+num3));
		 System.out.println("Round Sum in integer is "+ roundsum);
		
	}
}
