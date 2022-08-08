package com.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CSort {

	public List<String> cust(List<String> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		return list;

	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("R", "S", "G", "P", "A", "Y", "C");
		System.out.println(new CSort().cust(list));

		list.sort(Comparator.naturalOrder());
		System.out.println(list);

	}

}
