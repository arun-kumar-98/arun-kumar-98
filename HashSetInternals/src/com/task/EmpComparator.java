package com.task;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		return o2.name.compareTo(o1.name);
	}

}
