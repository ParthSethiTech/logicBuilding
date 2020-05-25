package com.testpackage.firstjavaproject;


public class HelloWorld {

	 public void squareDigits(int n) {
		 while((n % 10) == 0) {
			 System.out.println(n % 10);
		 }
	 }
	 public static void main(String[] args) {
		 HelloWorld test = new HelloWorld();
		 test.squareDigits(253);
	 }

 
}
