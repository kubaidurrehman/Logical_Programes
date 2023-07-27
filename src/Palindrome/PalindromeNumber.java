package Palindrome;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int orgNum= num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse of a number is : " + rev);

		if (orgNum==rev) {
			System.out.println(orgNum + " is palindrome.");
		} else {
			System.out.println(orgNum + " is not palindrome.");
		}

	}
}
