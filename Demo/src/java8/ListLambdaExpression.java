package java8;

import java.util.Arrays;
import java.util.List;

public class ListLambdaExpression {

	public static void getCourse(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("red", "blue", "green", "orange", "violet", "magenta");

		// lambda expression with stream()
		list.stream().forEach(color -> getCourse(color));
		// with method reference
		System.out.println("================================================");
		System.out.println("with method reference");
		System.out.println("=================================================");
		list.stream().forEach(color -> System.out.println(color));

		// iterate list without stream()
		System.out.println("iterate list without stream()");
		list.forEach(color -> getCourse(color));

		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=--=--=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("using method reference");
		list.forEach(ListLambdaExpression::getCourse);

	}
}
