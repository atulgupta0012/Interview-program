package test;
import java.util.*;
public class PalindromeString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String rev="";
		int length=s.length();
		for(int i= length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("The gievn string is palindrome string");
		}
		
		else
		{
			  System.out.println("The given string is not a palindrome string..");
		}
	}
}