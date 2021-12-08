package com.company;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		System.out.print("Enter The Number\n");
		Scanner scan= new Scanner(System.in);
		int a= scan.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			int prod=a*i;
			System.out.println(prod);
			scan.close();
		}
	}

}
