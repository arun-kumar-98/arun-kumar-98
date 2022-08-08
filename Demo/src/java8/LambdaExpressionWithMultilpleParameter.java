package java8;

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionWithMultilpleParameter {

	public static void main(String[] args) {

		Addable addable = new Addable() {

			@Override
			public int add(int a, int b) {
				int res = a + b;
				return res;
			}
		};
		System.out.println(addable.add(1, 9));

		System.out.println("using lambda expression");
		Addable addable2 = (int a, int b) -> (a + b);
		System.out.println(addable2.add(100, 10));

		System.out.println("=================================================");

		Addable addable3 = (a, b) -> (a + b);
		System.out.println(addable3.add(10, 5));

	}
}
