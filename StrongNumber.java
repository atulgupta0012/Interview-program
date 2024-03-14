package test;

public class StrongNumber 
{
	public static void main(String[] args) {
		
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			while(r>0)
			{
				fact=fact*r;
				r--;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		if(sum==temp)
		{
			System.out.println("The given number is Strong number");
		}
		
		else {
			System.out.println("The given number is not a strong number");
		}
			
			 
	}
}