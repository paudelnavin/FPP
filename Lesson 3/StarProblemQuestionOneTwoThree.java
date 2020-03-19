package com.grade.starproblems;

import java.util.Scanner;

public class StarProblemQuestionOneTwoThree {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length for the bottom of a picture: ");
		int length = sc.nextInt();
		
		for (int i=1; i<=length ; i++){
            for (int j=1; j<=i ;j++){
                if(j==1 || j==i || i==length) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
		
		System.out.println("============================================");
		
		for (int i=1; i<=length; i++){
            for (int j=length; j>=1; j--){
                if(j==1 || j==i || i==length) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
		
		System.out.println("============================================");
		
		for (int i=1; i<=(length/2)+1; i++)
        {
            for (int j=i; j<(length/2)+1; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i==(length/2)+1 || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
		
        sc.close();
	}
}
