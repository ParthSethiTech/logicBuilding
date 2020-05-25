package com.testpackage.firstjavaproject;

public class PatternPrint {
	void starPrint(int number) {
		int counter = 0;
		for(int i = 1 ; i <= number;i++) {
			
			counter = 0;
			do {
				
				System.out.print("x");
				counter = counter + 1;
			}
			while(counter != i);
			System.out.println("");
			
			
		}
		
}
	
		
	}
