package com.testpackage.firstjavaproject;

public class StringTesting {
	
	public static void main(String[] args) {
		String str = "Parth Sethi";
		str = str.toUpperCase();
		int Length = str.length();
		for(int counter = 1; counter <= Length; counter++) {
			System.out.println(str.substring(counter - 1, counter ));
		}
			System.out.println("**REVERSE**");
		for(int counter = Length; counter > 0; counter--) {
			System.out.println(str.substring(counter - 1, counter ));
		}
	}

}
