package com.basicJavaProgrames;

import java.util.Scanner;

public class FibonacciSerieswithRecursion {
	public static int a=0, b=1, c=0;
	public void fibo(int count) {
		
		if(count>0) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			count--;
			fibo(count);
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	int num = sc.nextInt();
	FibonacciSerieswithRecursion obj = new FibonacciSerieswithRecursion();
	System.out.print(a+" "+b);
	obj.fibo(num-2);
}
}
