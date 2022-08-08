package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@Id
	private Integer pId;
	private String fname;
	private String mname;

	private Integer hNO;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Child> child;

	public Parent() {
		super();
	}

	public Parent(Integer pId, String fname, String mname, Integer hNO, List<Child> child) {
		super();
		this.pId = pId;
		this.fname = fname;
		this.mname = mname;
		this.hNO = hNO;
		this.child = child;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Integer gethNO() {
		return hNO;
	}

	public void sethNO(Integer hNO) {
		this.hNO = hNO;
	}

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Parent [pId=" + pId + ", fname=" + fname + ", mname=" + mname + ", hNO=" + hNO + "]";
	}

}
