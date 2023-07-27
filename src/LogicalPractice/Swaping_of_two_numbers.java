package LogicalPractice;

public class Swaping_of_two_numbers {

public static void main(String[] args) {
	int a =10, b=20;
	int c;
	//1st logic with third variable
	System.out.println("Before Swapping a="+a+" b="+b);
	c=a;
	a=b;
	b=c;
	System.out.println("After Swapping a="+a+" b="+b);
	
	//2nd logic without third variable
	int x=100, y=300;
	System.out.println("before swapping x = "+x+" y ="+y);
	x=x*y;   //30000
	y=x/y;       //30000/300=100
	x=x/y;
	
	System.out.println("After swapping x = "+x+" y ="+y);
	
	//3rd logic without third variable
		int u=95, v=30;
		System.out.println("before swapping u = "+u+" v ="+v);
		u= u+v;   //95+30=125
		v=u-v;       //125-30=95
		u=u-v;  	//125-95=30
		
		System.out.println("After swapping u = "+u+" v ="+v);
		
		//4th logic without third variable
		int m=25,n=55;
		System.out.println("before swapping m = "+m+" n ="+n);
	m=m+n-(n=m);   	//n=25
	System.out.println("after swapping m = "+m+" n ="+n);
	
		
}
}
