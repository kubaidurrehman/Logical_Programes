package LogicalPractice;

import java.util.Scanner;

public class Reverse_of_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		//1st method 
		
		/*
		 * int rev=0; while(num!=0) { rev= rev*10 + num%10; num= num/10;
		 * 
		 * } System.out.println("Reverse of a number is : "+rev);
		 */
		
		
		// 2nd method
		
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num)); StringBuffer rev =
		 * sb.reverse();
		 * 
		 * System.out.println(rev);
		 */
		
		// 3rd method
		StringBuilder sb = new StringBuilder();
				sb.append(num);
				sb.reverse();
		System.out.println(sb);
		
	}
}
