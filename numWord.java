package com.testpackage.firstjavaproject;

import java.util.Scanner;

public class numWord {
	void numToWord(String n) {
		for(int i = 0;i < n.length();i++) {
			
			String x = n.substring(i, i+1);
			
			if(x.equals("1")) {
				System.out.print("One ");
			}
			if(x.equals("2")) {
				System.out.print("Two ");
			}
			if(x.equals("3")) {
				System.out.print("Three ");
			}
			if(x.equals("4")) {
				System.out.print("Four ");
			}
			if(x.equals("5")) {
				System.out.print("Five ");
			}
			if(x.equals("6")) {
				System.out.print("Six ");
			}
			if(x.equals("7")) {
				System.out.print("Seven ");
			}
			if(x.equals("8")) {
				System.out.print("Eight ");
			}
			if(x.equals("9")) {
				System.out.print("Nine ");
			}
			
			
		}
	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter Number");
		String num = scan.next();
		
		numWord test = new numWord();
		test.numToWord(num);
	}

}
