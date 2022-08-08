package map;

public class GenericTest {

	public static <T> void shout(T things) {
		System.out.println(things+ "??????????");
	}

	public static void main(String[] args) {

		Printer<Integer> printer = new Printer<Integer>(10);
		printer.print();

		Printer<String> printer1 = new Printer<>("hello from generic");
		printer1.print();

		Printer<Double> printer2 = new Printer<>(10.0);
		printer2.print();

		Printer<Integer> printer3 = new Printer<>(10);
		printer2.print();
		
		shout("hello");

	}
}
