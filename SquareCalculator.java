package com.testpackage.firstjavaproject;


public class SquareCalculator {
	void Square(int number) {
		String num = "";
		do {
			int val = number % 10;
			number = number / 10;
			val = val * val;
			num = num + val;
			
		}
		while(number  != 0);
		System.out.println(num);
		
	}

}
