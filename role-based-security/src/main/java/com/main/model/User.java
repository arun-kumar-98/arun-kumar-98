package com.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERAUTH")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private String username;
	private String password;
	private boolean active;
	private String roles;

	public User() {
		super();
	}

	public User(Integer id, String username, String password, boolean active, String roles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", active=" + active
				+ ", roles=" + roles + "]";
	}

}
