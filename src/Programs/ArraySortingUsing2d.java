package Programs;

public class ArraySortingUsing2d {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 100, 50 }, { 80, 90 } };
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int l = 0; l < arr[k].length; l++) {

						int temp = 0;
						if (arr[k][l] > arr[i][j]) {
							temp = arr[i][j];
							arr[i][j] = arr[k][l];
							arr[k][l] = temp;
						}

					}

				}

			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}

		}

	}
}
