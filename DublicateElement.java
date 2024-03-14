//  Dublicate arrya element

package test;

public class DublicateElement
{
	public static void main(String[] args) {
		
		int arr[]= {12,33,45,69,88,76,58,33,69,76};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}