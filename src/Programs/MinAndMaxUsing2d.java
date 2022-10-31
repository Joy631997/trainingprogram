package Programs;

public class MinAndMaxUsing2d {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 98, 95, 92 }, { 101, 96, 99 } };
		int max = arr1[0][0];
		int min = arr1[0][0];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] > max) {
					max = arr1[i][j];
				}

				else if (arr1[i][j] < min) {
					min = arr1[i][j];
				}
			}
		}
		System.out.println("Maximum Array :" + max);
		System.out.println("Minimum Array :" + min);
	}

}
