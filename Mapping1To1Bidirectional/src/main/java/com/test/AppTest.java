package com.test;

import com.dao.EmpDao;
import com.model.Dept;
import com.model.Employee;

public class AppTest {

	public static void main(String[] args) {

		Dept dept = new Dept();
		Employee employee = new Employee();
		employee.setEmpName("satyam");
		employee.setSal(15000.0);
		dept.setDeptId(101);
		dept.setDeptName("dev");
		dept.setLoc("HYD");
		dept.setEmployee(employee);
		employee.setDept(dept);

		EmpDao dao = new EmpDao();
		dao.saveEmp(employee);
	}

}
