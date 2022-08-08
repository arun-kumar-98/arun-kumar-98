
public abstract class A {

	public A() {
		System.out.println("from constructor");
	}

	public abstract void m1();

	public static void m2() {
		System.out.println("from concrete method");
	}

	public static void main(String[] args) {
		System.out.println("from main method");
		m2();

	}

}
