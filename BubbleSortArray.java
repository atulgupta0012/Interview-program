// Sort The array element ny using bubble sort in Ascending order

package test;

public class BubbleSortArray 
{
	public static void main(String[] args) {
		int arr[]= {12,33,44,55,66,15,57,76,38,81};
		  int size=arr.length;
		  for(int i=0;i<size;i++)
		  {
			  for(int j=0;j<size-1;j++)
			  {
				  if(arr[j]>arr[j+1])
				  {
					  int temp=arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
				  }
			  }
		  }
		  
		  for(int i=0;i<size;i++)
		  {
			  System.out.println(arr[i]);
		  }
	}
}
	