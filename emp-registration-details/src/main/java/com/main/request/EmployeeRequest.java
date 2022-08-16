package com.main.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "employee name can not be emplty")
	@Size(max = 15)
	private String name;

	@NotNull(message = " department mendatory")
	@Size(max = 4)
	private String department;
	@NotNull(message = "salalry mendatory")
	@Size(max = 10)
	private Double salary;
	@NotNull(message = "address mendatory")
	@Size(max = 50)
	private String address;
	@NotNull(message = "email mendatory")
	@Size(max = 25)
	private String email;

	@NotNull(message = "phone number is mendatory")
	@Size(max = 10)
	private String phone;

	public EmployeeRequest() {
		super();
	}

	public EmployeeRequest(@NotNull(message = "employee name can not be emplty") @Size(max = 15) String name,
			@NotNull(message = " department mendatory") @Size(max = 4) String department,
			@NotNull(message = "salalry mendatory") @Size(max = 10) Double salary,
			@NotNull(message = "address mendatory") @Size(max = 50) String address,
			@NotNull(message = "email mendatory") @Size(max = 25) String email,
			@NotNull(message = "phone number is mendatory") @Size(max = 10) String phone) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
