package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "d_tab")
public class Dept {

	@Id
	private Integer deptId;
	private String deptName;
	private String loc;

	@OneToOne
	@JoinColumn(name = "emp_fk")
	private Employee employee;

	public Dept() {
		super();
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Dept(Integer deptId, String deptName, String loc, Employee employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.loc = loc;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", loc=" + loc + ", employee=" + employee + "]";
	}

}
