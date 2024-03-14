package test;

public class PrimeNumber1 
{
	public static void main(String[] args) {
		for(int j=1;j<=100;j++)
		{
			int n=j;
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
				System.out.println(j+":is the prime number");
			}
		}
	}
}