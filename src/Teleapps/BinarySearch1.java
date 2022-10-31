package Teleapps;

public class BinarySearch1 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 55, 80, 17, 31};
		int key = 30;
		int last = arr.length-1;
		
		binarySearch(arr, 0, last, key);
	}
	
	static void binarySearch(int [] arr, int i, int j, int key)
	{
			int mid = (i+j)/2;
			while(i<=j)
			{
				
				if(arr[mid] < key)
				{
					i = mid + 1;
				}
				else if(arr[mid] == key)
				{
					System.out.println("Element is found at index : "+mid);
					break;
				}
				else
				{
					j = mid - 1;
				}
				mid = (i+j)/2;
			}
			if(i>j)
			{
				System.out.println("Element is not found");
			}
	}
}
