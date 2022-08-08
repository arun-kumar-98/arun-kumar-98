package com.task;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListReversedOrder {
	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("satyam");
		list.add("razak");
		list.add("mohan");
		list.add("saurabh");
		list.add("sana");
		System.out.println(list);

		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
	}

}
