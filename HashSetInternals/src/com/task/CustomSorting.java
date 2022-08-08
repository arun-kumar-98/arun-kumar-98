package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CustomSorting {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EmpComparator comparator = new EmpComparator();
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("satyam", "hyd", 15000));
		emp.add(new Employee("mohan", "hyd", 14000));
		emp.add(new Employee("saurabh", "delhi", 15000));
		emp.add(new Employee("abdul", "hyd", 20000));
		emp.add(new Employee("naresh", "hyd", 15000));
		System.out.println(emp);

		System.out.println("sorting using lambda expression");
		// java 8 feature
		/*
		 * Collections.sort(emp, (o1, o2) -> { return o1.name.compareTo(o2.name); });
		 */
		// System.out.println(emp);

		/*
		 * System.out.println("using java 8 method reference");
		 * 
		 * Comparator<Employee> comparator2 = Comparator.comparing(Employee::getName);
		 * 
		 * Collections.sort(emp, comparator2); System.out.println(
		 * "sorting by using java 8 method reference with comparing method in Comparator interface \n"
		 * + emp);
		 * 
		 * System.out.println("soritng using thenComparing() method");
		 */
		/*
		 * System.out.println("descending order sorting"); Collections.sort(emp,
		 * comparator); System.out.println(emp);
		 */

		System.out.println("lambda expression");
		Collections.sort(emp, (o1, o2) -> {
			return o2.name.compareTo(o1.name);
		});
		System.out.println(emp);

		// Collections.sort(emp, Comparator.reverseOrder());
		//System.out.println(emp);

	}

}
