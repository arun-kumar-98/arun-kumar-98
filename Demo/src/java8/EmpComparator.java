package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		return (int) (o1.getSalary() - o2.getSalary());

	};

	public static void main(String[] args) {
		Employee employee = new Employee(10, "rohan", 24, 350000.0);
		Employee employee1 = new Employee(10, "mohan", 25, 30000.0);
		Employee employee2 = new Employee(10, "sohan", 23, 330000.0);
		Employee employee3 = new Employee(10, "bohan", 29, 500000.0);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		Collections.sort(employees, new EmpComparator());
		System.out.println(employees);
	}

}
