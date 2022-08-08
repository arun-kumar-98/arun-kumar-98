package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String color;

	public Integer getId() {
		return id;
	}

	public Animal() {
		super();

	}

	public Animal(Integer id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		System.out.println(name);
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// System.out.println(name);
		this.name = name;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animals [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
