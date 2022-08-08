package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternal {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("naveen", "A");
		map1.put("saytam", "B");
		map1.put("saurabh", "C");
		map1.put(null, "D");
		System.out.println(map1);

	}
}
