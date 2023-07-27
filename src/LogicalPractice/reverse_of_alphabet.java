package LogicalPractice;

import java.util.Scanner;

public class reverse_of_alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentance");
		String word = sc.next();
		
		
		
		//StringBuffer sb = new StringBuffer(String.valueOf(word)).reverse();
		
		StringBuilder sb = new StringBuilder().append(word).reverse();
		
		
		System.out.println(sb);
	}
}
