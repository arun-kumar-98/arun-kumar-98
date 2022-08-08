package lambda.predicate;

import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		
		
		Integer[] arr = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70 };

		Predicate<Integer> p = i -> i % 2 == 0;
		Predicate<Integer> p1 = i -> i > 50;

		for (Integer n : arr) {
			if (p.and(p1).test(n)) {
				System.out.println(n);
			}
		}

		System.out.println("====================================================");
		System.out.println("or() working");
		for (Integer n : arr) {
			if (p.or(p1).test(n)) {
				System.out.println(n);
			}
		}
	}
}
