package stream.api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWayToCreateStream {

	public static void main(String[] args) {

		// 1.empty stream object
		Stream<Object> stream = Stream.empty();
		stream.forEach(e -> System.out.println(e));

		// 2.stream with array

		System.out.println("=============================================");
		String[] arr = { "satyam", "saurabh", "prevez", "mohan", "suvigya" };
		Stream.of(arr).forEach(element -> {
			System.out.println(element);
		});

		// 3.using stream builder
		Stream<Object> build = Stream.builder().build();

		System.out.println("from intstream array");
		IntStream intStream = Arrays.stream(new int[] { 1, 3, 2, 4, 5, 6, 7, 78, 8, 67, 56, 56 });
		// intStream.forEach(element -> { System.out.println(element); });

		// using method reference

		System.out.println("using method references");
		intStream.forEach(System.out::println);

	}

}
