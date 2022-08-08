package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flower {
	@Id
	private Integer id;
	private String fName;
	private String color;

	@ManyToOne
	private Plants plants;

	public Flower() {
		super();
	}

	public Flower(Integer id, String fName, String color, Plants plants) {
		super();
		this.id = id;
		this.fName = fName;
		this.color = color;
		this.plants = plants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Plants getPlants() {
		return plants;
	}

	public void setPlants(Plants plants) {
		this.plants = plants;
	}

}
