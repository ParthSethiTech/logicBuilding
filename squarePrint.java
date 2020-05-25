package com.testpackage.firstjavaproject;

public class squarePrint {
	void squarePattern(int number) {
		
		int i = 0;
		for(i = 1;i <= number;i++) {
		int cntr = 0;
		int counter = 0;
		do {
			counter += 1;
			System.out.printf("%d ",counter * counter);
			cntr = cntr + 1;
		}
		while(cntr != i);
		System.out.println("");
}
}
}