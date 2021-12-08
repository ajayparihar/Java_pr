package com.company;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		System.out.println("Enter the week day");
		Scanner scan= new Scanner(System.in);
		int d= scan.nextInt();
		int day=Math.abs(d);
		switch(day) {
		case 1:
			System.out.print("MONDAY");
			break;
		case 2:
			System.out.print("TUESDAY");
			break;
		case 3:
			System.out.print("WEDNESDAY");
			break;
		case 4:
			System.out.print("THURSDAY");
			break;
		case 5:
			System.out.print("FRIDAY");
			break;
		case 6:
			System.out.print("SATURDAY");
			break;
		case 7:
			System.out.print("SUNDAY");
			break;
			
			default:
			System.out.print("Invalid input");
			scan.close();
		}
	}
}
