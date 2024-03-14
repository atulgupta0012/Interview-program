package test;

public class PalindromeNumber1 
{
	public static void main(String[] args) {
		
		
		for(int j=1;j<=100;j++)
			
		{
			  
			int n=j;
			int temp=n;
			int rev=0;
			
			while(n>0)
			{
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			
			if(rev==temp)
			{
				System.out.println(j+":is the palindrome number");
			}
			
			
		}
	}
}