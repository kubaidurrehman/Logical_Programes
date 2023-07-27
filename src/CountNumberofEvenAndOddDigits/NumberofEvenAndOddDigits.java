package CountNumberofEvenAndOddDigits;

import java.util.Scanner;

public class NumberofEvenAndOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;

		while (number > 0) {
			int n = number % 10;

			if (n % 2 == 0 || n == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			number = number / 10;
		}
		System.out.println("Number of Even Digits are :" + evenCount);
		System.out.println("Number of Even Digits are :" + oddCount);
	}

	
}
