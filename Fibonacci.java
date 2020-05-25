package com.testpackage.firstjavaproject;

import java.util.Scanner;

public class Fibonacci {
	void FiboPrinter(int n) {
		int c = 0;
		int a = 1;
		int b = 1;
		for(int i = 1;i<= n;i++) {
			if(i==1) {
				System.out.print(a + " ");
				
			}
			if(i == 2) {
				System.out.print(b + " ");
			}
			if(i > 2) {
				
				c = a + b;
				System.out.print(c + " ");
				b = a;
				a = c;
			}
	
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    
	    System.out.println("Enter any number"); 
	    int num = scan.nextInt();
	       
	    
		Fibonacci test = new Fibonacci();
		test.FiboPrinter(num);
	}

}
