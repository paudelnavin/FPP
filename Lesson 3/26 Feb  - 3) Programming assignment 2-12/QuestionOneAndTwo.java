package Assignment;

public class QuestionOneAndTwo {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		min(arr1);
		average(arr1);
	}
	
	static int min(int[] arrayOfInts) {
		
		int min=arrayOfInts[0];
		
		for(int i=0; i<arrayOfInts.length; i++) {
			if(min > arrayOfInts[i]) {
				min=arrayOfInts[i];
		    }
		}
		System.out.println("minimum value of an array is "+min);
		
		return 0;	
	}
	
	static int average(int[] arrayOfInts) {
		
		int sum=0;
		for(int i=0; i<arrayOfInts.length; i++) {
			sum=sum+arrayOfInts[i];
		}
		
		System.out.println("Sum of an array value is "+sum);
		return 0;
	}

}
