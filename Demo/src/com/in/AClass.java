package com.in;

import java.util.ArrayList;
import java.util.Iterator;

public class AClass {

	/*
	 * write a customized immutable class 2. Sort the elements of an AL without
	 * using sort (use lambda expressions) Shraddha Jayaraman11:00 AM 3. to print
	 * even numbers in an AL using lambda expressions (first try to print all
	 * elements) Java Trained Interns Meet
	 */

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(40);
		arrayList.add(20);

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = arrayList.size() - 1; j >= 0; j--) {
				if (arrayList.get(i) < arrayList.get(j)) {
					int temp = arrayList.get(i);

					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp);

				}
			}

			System.out.println("sorted al is:");
			for (Object object : arrayList) {
				System.out.print(object + " ");
			}

			arrayList.forEach(System.out::println);

			Iterator iterator = arrayList.iterator();
			for (Object object : arrayList) {
				System.out.println(object);
			}

		}

	}
}