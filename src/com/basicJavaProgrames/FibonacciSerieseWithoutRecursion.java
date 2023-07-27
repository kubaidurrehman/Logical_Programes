package com.basicJavaProgrames;

import java.util.Scanner;

public class FibonacciSerieseWithoutRecursion {
public static void main(String[] args) {
	int a = 0, b=1, i, count;
	System.out.println("Enter a number :");
	Scanner sc = new Scanner(System.in);
	count = sc.nextInt();
	System.out.print(a+" "+b);
	for(i=2;i<count;i++) {
		int num = a+b;
		System.out.print(" "+num);
		a=b;
		b=num;
	}
	
}
}
