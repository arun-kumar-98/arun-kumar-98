package java8;

interface Sayable {
	public void say(String msg);
}

public class LambdaExpressionWithNoReturnType {

	public static void main(String[] args) {

		// without lambda expression

		Sayable sayable = new Sayable() {

			@Override
			public void say(String msg) {
				System.out.println(msg);
			}

		};

		sayable.say("hello lambda expression you are awesome for developers");

		Sayable sayable2 = (msg) -> {
			System.out.println(msg);
		};
		sayable2.say("hello from lambda");

	}
}