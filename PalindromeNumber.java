package test;

public class PalindromeNumber 
{
	public static void main(String[] args) {
		
		int n=121;
		int rev=0;
		int temp=n;;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		if(rev==temp)
		{
			System.out.println("The given number is palindrome number");
		}
		
		
		else
		{
			   System.out.println("The given number is not a palindrome number");
		}
	}
}