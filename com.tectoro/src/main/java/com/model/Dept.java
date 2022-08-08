package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class Dept {

	private String loc;
	private String deptName;

	public Dept() {
		super();
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept [loc=" + loc + ", deptName=" + deptName + "]";
	}

}
