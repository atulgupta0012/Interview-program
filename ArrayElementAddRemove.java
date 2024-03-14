package test;


public class ArrayElementAddRemove 
{
	public static void main(String[] args) {
		
		int arr[]= {12,33,44,55,70,98};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==12)
			{
				arr[i]=7645;
			}
			System.out.print(arr[i]+" ");
			
		}
		
		
	}
}