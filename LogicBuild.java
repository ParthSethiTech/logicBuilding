package com.testpackage.firstjavaproject;

public class LogicBuild {
	void revPattern(int n) {
		for (int i = 1; i <= n; i++) {

			int counter = n;
			int cantr = 0;
			do {
				System.out.print(" ");
				cantr = cantr + 1;
			} while (cantr != i);
			do {
				System.out.print("*");
				if (counter > 0) {
					counter -= 1;
				}

			} while (counter >= i);
			System.out.println("");

		}
		
		

		
	}
}
	
	
	



	
