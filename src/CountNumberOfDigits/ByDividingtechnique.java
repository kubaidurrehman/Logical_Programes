package CountNumberOfDigits;

import java.util.Scanner;

public class ByDividingtechnique {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number =456;
				//sc.nextInt();

		int count = 0;
		while (number != 0) {

			number = number / 10;
			count++;
		}
		System.out.println("number of Digits are : " + count);
	}
}
