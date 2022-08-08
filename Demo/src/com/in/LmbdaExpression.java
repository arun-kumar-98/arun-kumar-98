package com.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LmbdaExpression {

	public static void main(String[] args) {

		List<Integer> AL = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// find even numbers
		AL.stream().filter(evenNo -> evenNo % 2 == 0).forEach(System.out::println);

		// sum of all elements using lambda expression

		int total = AL.stream().mapToInt(s -> s.intValue()).sum();
		System.out.println("sum of all elements is  :" + total);

		Integer sum = AL.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		System.out.println("from lambda expression");

		AL.forEach(number -> {
			if (number % 2 == 0) {

				System.out.println(number);
			}

		});
	}

}
