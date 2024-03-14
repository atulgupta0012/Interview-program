package test;

public class ArrayPositiveNegative
{
	public static void main(String[] args) {
		
	     int arr[]= {-12,-33,44,55,0,66,11,-90,-38,-87};
	     int size=arr.length;
	     for(int i=0;i<size;i++)
	     {
	    	 if(arr[i]<0)
	    	 {
	    		 System.out.print(arr[i]+" ");
	    	 }
	     }
	     
	     for(int j=0;j<size;j++)
	     {
	    	 if(arr[j]>=0)
	    	 {
	    		 System.out.print(arr[j]+" ");
	    	 }
	     }
	}
}
