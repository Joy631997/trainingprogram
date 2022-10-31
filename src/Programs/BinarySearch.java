package Programs;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}

	private static void binarySearch(int[] arr, int i, int j, int key) {

		int mid = (i + j) / 2;
		while (i <= j) {
			if (arr[mid] < key) {
				i = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				j = mid - 1;
			}
			mid = (i + j) / 2;
		}
		if (i > j) {
			System.out.println("Element is not found!");
		}
	}
}
