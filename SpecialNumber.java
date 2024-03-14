package test;

public class SpecialNumber 
{
	public static void main(String[] args) {
		for(int j=1;j<=1000;j++)
		{
			int n=j;
			int temp=n;
			int prod=1;
			int sum=0;
			
			while(n>0)
			{
				int r=n%10;
				sum=sum+r;
				prod=prod*r;
				n=n/10;
			}
			
			if(sum+prod==temp)
			{
				System.out.println(j+": is the special number");
			}
		}
	}
}