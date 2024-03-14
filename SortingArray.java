//Sorting the array without sort method  in ascending order

package test;



public class SortingArray 
{
	public static void main(String[] args) {
		
		int arr[]= {12,33,44,1,22,2,3,5,77,18};
		int size=arr.length;
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		
	
	}
}