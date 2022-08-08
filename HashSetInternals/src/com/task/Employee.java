package com.task;

public class Employee {

	String name;
	String address;
	double salary;

	public Employee(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

}
