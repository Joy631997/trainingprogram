package Teleapps;

public class CountIncrease {
	public static void main(String[] args) {
		String s = "key = 1 , count = 10 || key = 2 , count = 18 || key = 3 , count = 100 || key = 4 , count = 8";
		String s1[] = s.split(" ");
		int count = 0, count1 = 0, num = 0;
		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			if ("=".equals(s1[i])) {
				count++;

				if (count % 2 == 0) {
					count1++;
					s2 = s1[i + 1];
					int n = Integer.parseInt(s2);
					num = n + count1;
					s1[i + 1] = String.valueOf(num);
				}
			}
			System.out.print(s1[i] + " ");
		}

	}
}