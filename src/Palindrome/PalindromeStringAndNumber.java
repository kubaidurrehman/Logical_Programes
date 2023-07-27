package Palindrome;

import java.util.Scanner;

public class PalindromeStringAndNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Value : ");
	String value = sc.next();
	
	StringBuffer sb = new StringBuffer(value.valueOf(value)).reverse();
	String reverse = sb.toString();
	//System.out.println(sb+" "+reverse+" "+value);
	if (value.equals(reverse)) {
		System.out.println(value+" is palindrome.");
	}else
	{
		System.out.println(value+" is not palindrome.");
	}

}
}
