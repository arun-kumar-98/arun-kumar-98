package com.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppTest {

	public static void main(String[] args) {

		Session session = new HibenateConfig().getFactory().openSession();
		Transaction tx = session.beginTransaction();

		Employee employee = new Employee();

		employee.setEmpId(1);
		employee.setEmpName("satyam");
		employee.setDept("dev");
		employee.setSal(15000.0);

		Employee employee2 = new Employee();

		employee2.setEmpId(2);
		employee2.setEmpName("Arun");
		employee2.setDept("dev");
		employee2.setSal(15000.0);

		List<Employee> emp = new ArrayList<>();
		emp.add(employee2);
		emp.add(employee);

		Project project = new Project();
		project.setProjId(101);
		project.setTitle("App23");

		Project project2 = new Project();

		project2.setProjId(102);
		project2.setTitle("App23");

		List<Project> proj = new ArrayList<>();
		proj.add(project2);
		proj.add(project);

		employee.setProject(proj);
		employee2.setProject(proj);

		project.setEmployee(emp);
		project2.setEmployee(emp);

		session.save(project);
		session.save(project2);

		session.save(employee);
		session.save(employee2);

		tx.commit();
		session.close();

	}

}
