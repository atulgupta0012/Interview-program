//Swapping number by using third variable

package test;

public class SwppaingNumber1
{
	public static void main(String[] args) {
		
		int a=66,b=90;
		System.out.println("Before swapping the value is:");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping the value is:");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
	}
}