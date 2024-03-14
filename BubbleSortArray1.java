// Sort the array elemnt by using bubble sort in descending order

package test;

public class BubbleSortArray1
{
	public static void main(String[] args) {
		int arr[]= {12,33,44,55,66,1,13,14,16,17,28};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]<arr[j+1])
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