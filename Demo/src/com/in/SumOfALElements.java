package com.in;

import java.util.Arrays;
import java.util.List;

public class SumOfALElements {
	int sum = 0;

	public int addElement(List<Integer> arrayList) {

		arrayList.stream().forEach(i -> sum += i);

		return sum;
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int total = new SumOfALElements().addElement(integers);
		System.out.println(total);
	}

}
