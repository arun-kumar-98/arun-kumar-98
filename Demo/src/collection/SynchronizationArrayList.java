package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizationArrayList {

	public static void main(String[] args) {

		List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
		list.add(10);
		list.add(80);
		list.add(90);
		list.add(60);
		list.add(50);
		list.add(20);
		list.add(30);

		// iterate arraylist

		synchronized (list) {
			list.forEach(num -> System.out.println(num));

		}

	}

}
