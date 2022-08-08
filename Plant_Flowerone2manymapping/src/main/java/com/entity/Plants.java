package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Plants {

	@Id
	private Integer id;
	private String name;

	@OneToMany
	private List<Flower> flower;

	public Plants() {
		super();
	}

	public Plants(Integer id, String name, List<Flower> flower) {
		super();
		this.id = id;
		this.name = name;
		this.flower = flower;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Flower> getFlower() {
		return flower;
	}

	public void setFlower(List<Flower> flower) {
		this.flower = flower;
	}

}
