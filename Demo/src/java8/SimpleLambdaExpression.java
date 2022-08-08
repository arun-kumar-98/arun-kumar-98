package java8;

interface Drawable {
	public void print();
}

public class SimpleLambdaExpression {

	public static void main(String[] args) {

		Drawable drawable = new Drawable() {

			@Override
			public void print() {
				System.out.println("printing lambda expression");

			}
		};

		drawable.print();
	}
}
