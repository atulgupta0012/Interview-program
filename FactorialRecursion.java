package test;
import java.util.*;
public class FactorialRecursion 
{
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		 int fact=findFactorial( n);
		 
		 System.out.println("The factorial of the gien number is :"+fact);
				 
		
	}
	
	
	public static int findFactorial(int n)
	{
		if(n>=1)
		{
			return n* findFactorial(n-1);
		}
		
		else {
			return 1;
		}
	}
}