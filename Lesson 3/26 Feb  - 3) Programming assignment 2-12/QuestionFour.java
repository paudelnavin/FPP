package Assignment;

public class QuestionFour {
	
	public static void main(String[] args) {
		
		double row1=0.0;
		double row2=0.0;
		double row3=0.0;
		double col1=0.0;
		double col2=0.0;
		double col3=0.0;
		double col4=0.0;
		double col5=0.0;
		double col6=0.0;
		
		double[][] matrix = new double[3][6];
		
		matrix[0][0]=10000.00;
		matrix[0][1]=10000.00;
		matrix[0][2]=10000.00;
		matrix[0][3]=10000.00;
		matrix[0][4]=10000.00;
		matrix[0][5]=10000.00;
		
		matrix[1][0]=11000.00;
		matrix[1][1]=11100.00;
		matrix[1][2]=11200.00;
		matrix[1][3]=11300.00;
		matrix[1][4]=11400.00;
		matrix[1][5]=11500.00;
		
		matrix[2][0]=12100.00;
		matrix[2][1]=12321.00;
		matrix[2][2]=12544.00;
		matrix[2][3]=12769.00;
		matrix[2][4]=12996.00;
		matrix[2][5]=13225.00;
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=5; j++) {
				if(i==0)
				   row1 = row1 + matrix[i][j];
				if(i==1)
				   row2 = row2 + matrix[i][j];
				if(i==2)
				   row3 = row3 + matrix[i][j];
			}
		}
		
		System.out.println("Average of row 1 is: " + row1/6);
		System.out.println("Average of row 2 is: " + row2/6);
		System.out.println("Average of row 3 is: " + row3/6);
	
		for(int j=0; j<=5; j++) {
			for(int i=0; i<=2; i++) {
				if(j==0)
				   col1 = col1 + matrix[i][j];
				if(j==1)
				   col2 = col2 + matrix[i][j];
				if(j==2)
				   col3 = col3 + matrix[i][j];
				if(j==3)
				   col4 = col4 + matrix[i][j];
				if(j==4)
				   col5 = col5 + matrix[i][j];
				if(j==5)
				   col6 = col6 + matrix[i][j];
			}
		}
		
		System.out.println("Average of Column 1 is: " + col1/3);
		System.out.println("Average of Column 2 is: " + col2/3);
		System.out.println("Average of Column 3 is: " + col3/3);
		System.out.println("Average of Column 4 is: " + col4/3);
		System.out.println("Average of Column 5 is: " + col5/3);
		System.out.println("Average of Column 6 is: " + col6/3);
	}
	

}
