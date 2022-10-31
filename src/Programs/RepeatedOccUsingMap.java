package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatedOccUsingMap {
	public static void main(String[] args) {
		String name = "goodmorning";
		HashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}
}
