package java8;

import java.util.HashSet;

public class HashSetWIthLambdaExpression {

	public static void coursePrint(String course) {
		System.out.println(course);
	}

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("java");
		hashSet.add("c");
		hashSet.add("c++");
		hashSet.add("spring");
		hashSet.add("hibenate");

		System.out.println(hashSet);

		hashSet.stream().forEach(course -> System.out.println(course));

		// hashSet.stream().forEach(HashSetWIthLambdaExpression::coursePrint);

		System.out.println("=============================================");

		hashSet.forEach(HashSetWIthLambdaExpression::coursePrint);

		System.out.println("===============================================");

		System.out.println("using lambda without stream()");
		hashSet.forEach(course -> coursePrint(course));

		System.out.println("================================================");

		hashSet.forEach(course -> coursePrint(course));

	}
}
