//  Sorting the array by using sort method...

package test;

import java.util.Arrays;

public class SortingArray1
{
	public static void main(String[] args) {
		int arr[]= {12,44,31,11,21,43};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			Arrays.sort(arr);
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}