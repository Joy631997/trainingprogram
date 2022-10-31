package Programs;

import java.util.Arrays;

public class CommonSmallestNumInArrs {

	public static void main(String[] args) {
		int[] A = { 10, 8, 2, 4, 6, 9 };
		int[] B = { 8, 4, 11, 1, 2 };
		int[] C = { 6, 14, 8, 2, 4, 11 };
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < C.length; k++) {
					if (A[i] == B[j] && A[i] == C[k]) {
						System.out.println(A[i]);
						System.exit(0);
					}
				}
			}

		}
	}
}
