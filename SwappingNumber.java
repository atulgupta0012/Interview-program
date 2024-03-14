
// Swapping the number without using third variable


package test;

public class SwappingNumber
{
	public static void main(String[] args) {
		
		int a=9,b=12;
		System.out.println("Before swapping the value is:");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the value is:");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
	}
}