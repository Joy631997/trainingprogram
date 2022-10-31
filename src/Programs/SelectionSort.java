package Programs;

public class SelectionSort {
	public static void main(String[] args) {
		selectionSort();
	}

	static void selectionSort() {
		int arr[] = { 11, 5, 12, 7, 6 };
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}

		}
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}
}
