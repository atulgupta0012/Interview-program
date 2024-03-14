//second largest number

package test;

public class SecondLargest
{
	public static void main(String[] args) {
		
		int arr[]= {12,33,44,545,55,876,789};
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
		}
		
		System.out.println("Second largset element of an array is:"+arr[size-2]);
	}
}