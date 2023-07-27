package CountNumberOfDigits;

import java.util.Scanner;

public class ByString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		String value = sc.next();

		int count = value.length();
		System.out.println("Number of charater or digits are :" + count);
	}
}
