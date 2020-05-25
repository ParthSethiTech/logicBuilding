package com.testpackage.firstjavaproject;

public class SpecialRequest {
	void numSum(int number) {
		int sum = 0;
		do {
			sum = 0;
		do{
			int val = (int) (number % 10);
			
			sum = sum + val;
			number = number / 10;
			
		}
		while(number != 0);
		number = sum;
		}
		while(sum/10 != 0);
		
		System.out.println(sum);
		

		
	
	}
public static void main(String[] args) {
	SpecialRequest number = new SpecialRequest();
	number.numSum(354);  
}

}

