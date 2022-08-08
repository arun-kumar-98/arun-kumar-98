package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamapiExample {
	public static void main(String[] args) {
		List<Integer> lists = List.of(10, 23, 34, 23, 5, 65, 1, 34, 68);

		List<Integer> list = new ArrayList<Integer>();
		// without stream api
		for (Integer i : lists) {

			if (i % 2 == 0)
				list.add(i);
		}
		System.out.println(list);

		// using java 8 stream api
		Stream<Integer> stream = lists.stream();
		List<Integer> listEven = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(listEven);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

}
