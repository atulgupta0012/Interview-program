// reverse array element

package test;

public class ReverseArrayElemnent 
{
	public static void main(String[] args) {
		int arr[]= {12,56,67,11,2,35,11,10};
		int size=arr.length;
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}