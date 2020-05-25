package com.testpackage.firstjavaproject;

public class multiplicationTable {
	
	void print(int table) {
		print(table,1,10);	
	 }
	
	void print() {
		print(5,1,10);
	}
	
	void print(int table, int from, int to) {
		for(int i = from;i <=to;++i) {
			System.out.printf("%d into %d = %d",table,i,table*i).println();
		}

	}
	
	
}
         