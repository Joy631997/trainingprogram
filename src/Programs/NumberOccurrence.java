package Programs;

import java.util.Arrays;

public class NumberOccurrence {
	public static void main(String[] args) {
		int arr[] = { 11, 1, 2, 2, 3, 5, 3, 5, 2, 2, 1 };

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				int num = arr[i];
				int count = 1;
				for (int j = i; j < arr.length - 1; j++) {
					if (num == arr[j + 1]) {
						arr[j + 1] = -arr[j + 1];
						count++;

					}

				}
				System.out.println(arr[i] + " " + "Count is" + " " + count);
			}
		}
	}
}
