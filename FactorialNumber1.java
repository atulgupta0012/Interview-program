package test;

public class FactorialNumber1
{
   public static void main(String[] args) {
	   int fact=1;
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=i;j<=i;j++)
		  {
			  fact=fact*j;  
		  }
		    System.out.println("The factorial of the given number is:"+fact);
	  }
}
}