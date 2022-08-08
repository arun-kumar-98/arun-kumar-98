
public class Swap {

	public void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);

	}

	public void swap3(int a, int b) {
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		new Swap().swap(10, 20);
		new Swap().swap3(10, 30);
	}

}
