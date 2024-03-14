package test;

import java.util.*;
public class PalindromeString
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("The given String is palindrome String");
		}
		
		else
		{
			  System.out.println("The given String is not a palindrome STring");
		}
	}
}