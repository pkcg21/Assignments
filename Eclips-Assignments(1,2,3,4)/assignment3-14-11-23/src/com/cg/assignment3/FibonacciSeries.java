package com.cg.assignment3;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		 int n=10;
		 System.out.println("Fibonacci serie up to"+n+"terms:");
		 int firstTerm=0,secondTerm=1;
		 for(int i=0;i<n;i++) {
			 System.out.println(firstTerm+" ");
			 int nextTerm=firstTerm+secondTerm;
			 firstTerm=secondTerm;
			 secondTerm=nextTerm;
		 }
	}

}
