package ReverseOfString;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CharAtmethod {

	public static void main(String[] args) {
		String rev="";
		String sentance = "Hi I am Ubaid.";
		int length = sentance.length();
		
		for (int i=length-1; i>=0; i--) {
			rev = rev + sentance.charAt(i);
		}
		System.out.println(rev);
		
		// for cutting sub string from the string
		/*
		 * char[] array = sentance.toCharArray(); sentance.getChars(3,12, array, 0);
		 * System.out.println(Arrays.toString(array));
		 */
	}
	
}
