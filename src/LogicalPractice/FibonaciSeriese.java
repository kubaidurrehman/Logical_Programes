package LogicalPractice;

import java.util.Scanner;

public class FibonaciSeriese {
 
	public static void main(String[] args) {
		int a=0, b=1,c;
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (int i=2; i<=count; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
}
