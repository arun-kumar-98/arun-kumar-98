package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListREversseOrder {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(2, 9, 3, 4, 54, 12, 6, 45, 41, 3, 10);
		Collections.sort(integers);
		System.out.println(integers);

		System.out.println("===============================================");
		System.out.println("using comparator");
		Collections.sort(integers, Comparator.reverseOrder());
		System.out.println(integers);
	}

}
