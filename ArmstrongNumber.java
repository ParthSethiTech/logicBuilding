package com.testpackage.firstjavaproject;

public class ArmstrongNumber {
	void findArmstrong(int number) {
		int numberIterator = number;
		int sum = 0;
		do {
			int val = numberIterator % 10;
			sum = sum + (val * val * val);
			numberIterator = numberIterator / 10;
		}
		while(numberIterator != 0);
		if(sum == number) {
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not an armstrong number");
		}
		
		
	}

}
