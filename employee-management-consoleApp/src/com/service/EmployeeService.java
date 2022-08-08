package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Employee;

public class EmployeeService {

	static Integer idCount = 1;

	/**
	 * @param arrayList to store employee record
	 * 
	 * 
	 */

	public static void display(ArrayList<Employee> employees) {
		System.err.println("==========Employee console based application===============");

		// format records like table
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	// main method
	public static void main(String[] args) {

		Integer id = null;
		String name = null;
		String address = null;
		Double salary = null;
		String dept = null;
		Integer numberOfEmployeeInsert = null;

		// scanner to read the console input
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<>();

		do {

			Integer i = 0;
			System.out.println("----------------------welcome to app--------------------");
			System.out.println("1. add the employee\n" + " 2.search employee\n" + "3.edit employee details\n"
					+ "4.delete employee records" + "5.display all employee record\n" + "6.quite");

			// now read the switch cases
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				System.out.println("enter number of employee to be insert...");
				numberOfEmployeeInsert = scanner.nextInt();
				while (i < numberOfEmployeeInsert) {

					// assign values
					/*
					 * System.out.println("enter the folloeing details.......");
					 * System.out.println("enter employee id"); id = scanner.nextInt();
					 */
					System.out.println("enter employee name");
					String ename = scanner.next();
					/**
					 * VALIDATE FIELD
					 **/

					if(list.size()>0) {
						for (Employee employee : list) {
							if (ename.equalsIgnoreCase(employee.getName())) {
								System.out.println("employee name already exists in list");
							} else {
								name = ename;
							}
						}}
					else {
						name=ename;
					}

					System.out.println("enter employee address");
					address = scanner.next();
					System.out.println("enter employee salary");
					salary = scanner.nextDouble();
					System.out.println("enter employee department");
					dept = scanner.next();

					// now adding all employee details to list

					list.add(new Employee(idCount, name, address, salary, dept));
					// check if name there

					i++;

					idCount++;

				}

				// now display the record
				// display(list);
				break;

				// search employee based on id

			case 2:
				System.out.println("enter employee  id");
				int employeeid = scanner.nextInt();

				// iterate loop
				for (Employee employee : list) {
					if (employeeid == employee.getId()) {
						// print record
						System.out.println(employee);
						break;
					} else {
						System.out.println("sorry given . " + employeeid + " employee does not exists ");
						break;
					}
				}
				break;

			case 3:
				System.out.println("enter employee id what you want to update..");
				int getEmpid = scanner.nextInt();
				for (Employee employee : list) {
					int eId = 0;
					if (getEmpid == employee.getId()) {
						eId++;

						// take what field you want to upadate
						do {

							int ch = 0;
							System.out.println("enter  field to edit here.... ");
							System.out.println(
									"1. update name\n" + "2. update address\n" + "3. salary\n" + "4. update dept");

							System.out.println("enter update choice :");
							ch = scanner.nextInt();
							switch (ch) {
							case 1:
								System.out.println("enter updated name");
								name = scanner.next();
								employee.setName(name);
								System.out.println(employee);
								break;

							case 2:
								System.out.println("enter new address..");
								address = scanner.next();
								employee.setAddress(address);
								System.out.println(employee);
								break;

							case 3:
								System.out.println("enter updated salary ? ");
								salary = scanner.nextDouble();
								employee.setSalary(salary);
								break;

							case 4:
								System.out.println("enter updated dept");
								dept = scanner.next();
								employee.setAddress(address);
								System.out.println(employee);
								break;

							default:
								System.out.println("given " + employee.getId() + " does not exists");
								System.out.println(employee);
								break;
							}

						} while (false);
					} else {
						System.out.println("employee id is not available " + eId);
						break;
					}
				}
				break;
				// delete by id
			case 4:
				System.out.println("enter employee to be deleted");
				int delId = scanner.nextInt();
				for (Employee employee : list) {
					if (delId == employee.getId()) {
						list.remove(employee);
						System.out.println("after deletion of gievn " + delId);
						break;

					}
				}
				System.out.println(list);
				break;

				// display all employee records
			case 5:
				System.out.println("display all records");
				display(list);
				break;

			case 6:
				// System.out.println("you want to quite");
				return;

			default:
				System.out.println("please enter correct choice ");
				break;
			}

		} while (true);

	}

}
