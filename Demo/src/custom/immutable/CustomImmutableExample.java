package custom.immutable;

// rules for custom immutable class 

//1. class must be final
//2.declare class member as private
//3.provide only getter()
//4.initialize class member using constructor only

final class CustomImmutableExample {

	private int id;
	private String name;
	private int age;

	public CustomImmutableExample(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "CustomImmutableExample [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		CustomImmutableExample customImmutableExample = new CustomImmutableExample(101, "abc", 23);
		System.out.println(customImmutableExample);
	}

}
