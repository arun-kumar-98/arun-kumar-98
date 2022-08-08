package lambda.predicate;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> (i > 20);
		System.out.println(predicate.test(30));

		// check string length
		Predicate<String> predicate2 = (string) -> string.length() > 4;
		System.out.println(predicate2.test("welcome"));
		System.out.println(predicate2.test("xyz"));

		System.out.println("================================================");
		String[] names = { "rohan", "rhon", "wlcome", "marry", "milllersd" };
		System.out.println(names);
		System.out.println("----------------------------------------------------");
		// check greter than 4
		for (String name : names) {
			System.out.println(predicate2.test(name));
		}
	}
}
