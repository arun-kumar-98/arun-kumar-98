package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMaptoArraylist {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");
		System.out.println(map1);

		Iterator itr = map1.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());

		}

		List<Integer> integers = new ArrayList<Integer>(map1.keySet());
		System.out.println("size of list:   " + integers.size());

		for (Integer integer : integers) {
			System.out.println(integer);
		}

		// get hash map values in arraylist
		List<String> val = new ArrayList<String>(map1.values());
		for (String string : val) {
			System.out.println(string);
		}

	}

}
