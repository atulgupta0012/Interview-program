package test;

public class StrongNumber1 
{
	public static void main(String[] args) {
		
		for(int j=1;j<=1000;j++)
		{
			int n=j;
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
				  System.out.println(j+": is the Strong number");
			  }
		}
	}
}