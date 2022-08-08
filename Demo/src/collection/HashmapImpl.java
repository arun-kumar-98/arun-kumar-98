package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapImpl {
	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("s1", "saurabh");
		hashMap.put("s2", "sanjay");
		hashMap.put("s3", "sankalp");
		hashMap.put("s4", "mohan");
		hashMap.put("s5", "naresh");

		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = hashMap.get(key);

			System.out.println(key + "    " + value);
		}

		// mar.entry interface

		System.out.println("iterating using map.Entry interface");

		Iterator<Entry<String, String>> iterator2 = hashMap.entrySet().iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, String> entry = iterator2.next();
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}

		System.out.println("using enhance for loop");

		for (String str : hashMap.keySet()) {
			String value = hashMap.get(str);
			System.out.println(str + "   " + value);
		}
		System.out.println("---------------------------------------------");
		System.out.println("using java 8 feature");
		hashMap.forEach((k, v) -> System.out.println("key: " + k + "   " + "value: " + v));

	}
}
