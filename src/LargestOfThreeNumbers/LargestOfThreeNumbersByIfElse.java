package LargestOfThreeNumbers;

import java.util.Scanner;

public class LargestOfThreeNumbersByIfElse {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2 Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3 Number :");
		int num3 = sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" Number is a largest number ");
		}else if(num2>num3 && num2>num1) {
			System.out.println(num2+" Number is a largest number ");
		}else {
			System.out.println(num3+" Number is a largest number ");
		}
}
}
