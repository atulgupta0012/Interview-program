package test;
import java.util.*;
public class ProgramScanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ener the number");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
		
	{
		for(int j=0;j<n-i;j++)
			
		{
			System.out.print("  ");
		}
		
		
		
		for(int k=0;k<(i*2)-1;k++)
		{
			System.out.print(" *");
		}
		
		System.out.println();
	}
}
}
