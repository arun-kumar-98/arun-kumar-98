package collection;

import java.util.HashMap;
import java.util.HashSet;

public class MissngKeyInHashmap {
	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");
		System.out.println(map1);

		System.out.println("----------------------------------------");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		System.out.println(map2);

		// finding missing key in

		HashSet<Integer> containsKey = new HashSet<>(map2.keySet());
		containsKey.addAll(map1.keySet());
		containsKey.removeAll(map2.keySet());
		System.out.println(containsKey);

		int n = 10;
		int hash = 3823823;
		int index = (hash & n - 1);
		System.out.println(index);
	}

}
