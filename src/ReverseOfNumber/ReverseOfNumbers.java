package ReverseOfNumber;

import java.util.Scanner;

public class ReverseOfNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = sc.nextInt();
	int rev =0;
	while(num!=0) {
	rev = rev*10 + num%10;//0*10+4=4   40+3=43     430+2=432   432+1=4321
	//seprating last digit and shifting to its next bigger digit
	num = num/10;		// 123			12			1				0
	// for remoing 1 digit from the last
	}
	System.out.println("Reverse of a number is = "+rev);
}
}
