package com.task;

import java.util.List;

public class SearchObjectInList {

	public static void main(String[] args) {
		List<String> list = List.of("satyam", "mohan", "arun", "razak", "naresh", "naveen");

		if (list.contains("satyam singh") == true) {
			System.out.println("found");
		} else {
			System.out.println("data not found");
		}

		// comparing one list to list objects

		List<String> list2 = List.of("w", "razaks");

		// use conatainsAll(list)

		if (list.containsAll(list2) == true) {
			System.out.println("objects found   " + list2);
		} else {
			System.out.println("object not in list    " + list);
		}
	}
}
