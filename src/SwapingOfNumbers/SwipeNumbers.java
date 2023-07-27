package SwapingOfNumbers;

public class SwipeNumbers {
public static void main(String[] args) {
	int a=10, b=20;
	System.out.println("Before swaping A= "+a+" B= "+b);
	//1st logic Swapping numbers with the help of variable
	
	/*
	 * int c = a; a=b; b=c;
	 */
	
	// 2nd logic without using third variable with the help of + and - operators
	
	/*
	 * a=a+b; b=a-b; a=a-b;
	 */
	
	// 3rd  logic without using third variable with the help of * and / operators
	
	/*
	 * a=a*b; b=a/b; a=a/b;
	 */
	
	// note anyone of value should not be 0
	
	// 4th logic without using third variable 
	
	b=a+b-(a=b);
	
	System.out.println("After swapping A= "+a+"\nB= "+b);
	
}
}
