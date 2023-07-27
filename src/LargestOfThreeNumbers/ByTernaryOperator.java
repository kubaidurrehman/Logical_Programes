package LargestOfThreeNumbers;

import java.util.Scanner;

public class ByTernaryOperator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2 Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3 Number :");
		int num3 = sc.nextInt();
		
		int num4=num1>num2?num1:num2;
		
		int lnum= num4>num3?num4:num3;
		System.out.println("Largest Number is :" +lnum);
}

}
