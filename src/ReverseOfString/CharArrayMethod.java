package ReverseOfString;

public class CharArrayMethod {
public static void main(String[] args) {
	String sentance ="java is a object oriented progrmming language.";
	char [] arr = sentance.toCharArray();
	String rev="";
	int len= sentance.length();
	
	for(int i=len-1; i>=0; i--) {
		rev = rev+arr[i];
	}
	System.out.println(rev);
}
}
