package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ALdemo {

	public static void main(String[] args) {

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add("4");
		arrayList.add(10);
		arrayList.add("abc");
		arrayList.add('c');
		arrayList.add(90.0);
		arrayList.add(10.0f);
		System.out.println(arrayList);

		System.out.println("lowest index values" + 0);
		System.out.println("highest index element" + (arrayList.size() - 1));

		ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(12, 23, 10, 15, 22, 20, 10, 22));
		System.out.println(arrayList2);

		// different way to iterate an arraylist
		for (int i = 0; i < arrayList2.size(); i++) {
			System.out.println(arrayList2.get(i));
		}
		System.out.println("-----------------------");
		for (Integer integer : arrayList2) {
			System.out.println(integer);
		}
		System.out.println("-=-=====----==-=-=-=-==--=--=-=---=");
		Iterator<Integer> iterator = arrayList2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=-=-==-=--=-=-=-=-=-=-=-=-=-=-=-===-=-==-=-=-=");
		arrayList2.stream().forEach(element -> System.out.println(element));

		System.out.println("using list iterator");
		ListIterator<Integer> lt = arrayList2.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}

		System.out.println("===================================");
		System.out.println("cloning an arraylist");
		ArrayList<Integer> arrayList3 = (ArrayList<Integer>) arrayList2.clone();
		System.out.println(arrayList3);

		System.out.println("--------------------------------");
		System.out.println(arrayList2.lastIndexOf(22));

		/*
		 * System.out.println("======removeAll()===============");
		 * arrayList2.removeIf(num -> num % 2 == 0); System.out.println(arrayList2);
		 * 
		 * arrayList2.retainAll(Collections.singleton(20));
		 * System.out.println(arrayList2);
		 */
		System.out.println("sublist method");
		System.out.println(arrayList2);

	System.out.println(arrayList2.subList(2, 6));

	}
}
