package com.imperative.functionalp_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println("//imprative approach");

		List<Person> list = List.of(new Person("saatyam", Gender.MALE), new Person("saurabh", Gender.MALE),
				new Person("ananya", Gender.FEMALE), new Person("suvigya", Gender.MALE));

		System.out.println(list);

		List<Person> filter = new ArrayList<>();
		for (Person person : list) {
			if (Gender.MALE.equals(person.gender)) {
				filter.add(person);
			}
		}
		System.out.println(filter);
		System.out.println();
		System.out.println();

		System.out.println("filtered result");
		filter.stream().forEach(System.err::println);

		System.out.println("//==============================//");

		System.out.println("//declarative approach");
		list.stream().filter(person -> Gender.MALE.equals(person.gender)).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	static class Person {
		private String name;
		private Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE;
	}
}
