package com.company;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		int num1,num2,opr;
		System.out.println("Enter Number 1");
		Scanner s1= new Scanner(System.in);
		 num1= s1.nextInt();
		 
		 System.out.println("Enter Number 2");
		 Scanner s2= new Scanner(System.in);
			 num2= s2.nextInt();
			 
			 System.out.println("Enter 1 to ADD\n"+ "Enter 2 to SUBTRACT\n"+"Enter 3 to MULTIPLY\n"+"Enter 4 to DIVIDE\n");
			 Scanner s3= new Scanner(System.in);
				opr= s3.nextInt();
				switch(opr) {
				case 1:
					System.out.println("Result is:- "+(num1 + num2));
					break;
				case 2:
					System.out.println("Result is:- "+(num1 - num2));
					break;
				case 3:
					System.out.println("Result is:- "+(num1 * num2));
					break;
				case 4:
					System.out.println("Result is:- "+(num1 / num2));
					break;
					default:
						System.out.println("Invalid Input");	
				}
			s1.close();
			s2.close();
			s3.close();
		}
	}
