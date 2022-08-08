package java8;

interface MessageSender {
	public String sender();
}

public class LambdaExpressionWithReturnTyoe {

	public static void main(String[] args) {

		MessageSender messageSender = new MessageSender() {

			@Override
			public String sender() {

				return "Annonymous class with return type";
			}
		};

		System.out.println(messageSender.sender());

		System.out.println("===================================");

		MessageSender messageSender2 = () -> {
			return "from lambda expression return string";
		};
		System.out.println(messageSender2.sender());

	}
}
