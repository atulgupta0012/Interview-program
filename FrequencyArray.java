
// Find the common element between two array

package test;
public class FrequencyArray 
{
	public static void main(String[] args) {
		
		
		int arr1[]= {12,5,55,88,90,23,56,78};
		int arr2[]= {12,5,78,55,33,22,5566};
		int size1=arr1.length;
		int size2=arr2.length;for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		
		
		
	}
}