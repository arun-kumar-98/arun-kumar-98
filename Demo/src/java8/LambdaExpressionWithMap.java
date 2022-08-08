package java8;

import java.util.HashMap;

public class LambdaExpressionWithMap {

	public static void corses(int no, String name) {
		System.out.println(no + "     " + name);
	}

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "c");
		hashMap.put(2, "c++");
		hashMap.put(3, "java");
		hashMap.put(4, "spring");
		hashMap.put(5, "hibenate");

		hashMap.forEach((i, j) -> corses(i, j));

		System.out.println("===========================");

		hashMap.forEach(LambdaExpressionWithMap::corses);

		System.out.println("==================================");

		System.out.println("working along with stream()");
		

	}

}
