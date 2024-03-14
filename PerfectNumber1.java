package test;

public class PerfectNumber1 
{
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int n=i;
			int sum=0;
			for(int j=1;j<=n/2;j++)
			{
				if(n%j==0)
				{
					sum=sum+j;
				}
			}
			
			if(sum==n)
			{
				System.out.println(i+": is the perfect number");
			}
			
		}
	}
}