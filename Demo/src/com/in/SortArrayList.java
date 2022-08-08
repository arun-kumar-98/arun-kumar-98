package com.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayList {

	/*
	 * custom soritng method sort the arraylist
	 */

	public ArrayList<Integer> customSort(ArrayList<Integer> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i) > arrayList.get(j)) {
					int temp = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp);
				}
			}

		}
		return arrayList;

	}

	public static void main(String[] args) {

		/*
		 * ArrayList<String> al = new ArrayList<>();
		 * 
		 * al.add("red"); al.add("green"); al.add("blue"); al.add("orange");
		 * al.add("black");
		 * 
		 */		
		
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		/*
		 * taking arraylist from user
		 */

		System.out.println("enter size of arrayList");
		int al_size = scanner.nextInt();

		for (int i = 0; i < al_size; i++) {
			int n = scanner.nextInt();

			arrayList.add(n);
		}

		System.out.println("sorting an array using lambda expression");

		System.out.println("before sorting arrayList:  " + arrayList);

		System.out.println("arraylist element after sorting:  " + new SortArrayList().customSort(arrayList));

		/*
		 * using lambda expression sort arraylist by java 8 feature
		 */

		System.out.println("sorting an array using lambda expression");

		arrayList.sort((i, j) -> Integer.compare(i, j));
		System.out.println(arrayList);

		// al.sort((k, m) -> String.compare(k, m));
	}

}
