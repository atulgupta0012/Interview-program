package test;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int temp=n, result=0;
		
		while(n!=0)
		{
			int r=n%10;
		
			
				result=result+r*r*r;
			
			
			n=n/10;
		}
		
		if(result==temp)
		{
			System.out.println("The number is armstrong number");
		}
		
		else
		{
			System.out.println("The number is not a armstrong number");
		  }
		
		
	}

}
