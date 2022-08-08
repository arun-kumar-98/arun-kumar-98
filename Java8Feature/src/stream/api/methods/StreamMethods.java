package stream.api.methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> list = List.of("Arun", "Amit", "Ankit", "satyam", "mohan", "sanjay", "saurabh");

		// use filter()

		List<String> list2 = list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println(list2);

		// use filter with for each method

		list.stream().filter(s -> s.startsWith("s")).forEach(System.out::println);

		Stream<String> stream = list.stream().filter(s -> s.startsWith("s"));

		// map()

		List<Integer> integers = List.of(3, 5, 6, 8, 10, 12, 15);

		List<Integer> list3 = integers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(list3);

		integers.stream().map(n -> n * n).forEach(System.out::println);

	}
}
