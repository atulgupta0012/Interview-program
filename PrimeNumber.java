package test;

public class PrimeNumber
{
	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("The given number is  Prime number");
		}
		
		else
		{
			  System.out.println("The given number is not a prime number");
		}
	}
}