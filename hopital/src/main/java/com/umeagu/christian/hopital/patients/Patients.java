package com.umeagu.christian.hopital.patients;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patients {


	private final UUID id;
	private String name;
	private int age;

	private Date last_visit_date;


	public Patients(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("age") int age,
			@JsonProperty("last_visit_date") Date last_visit_date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.last_visit_date = last_visit_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getLast_visit_date() {
		return last_visit_date;
	}

	public void setLast_visit_date(Date last_visit_date) {
		this.last_visit_date = last_visit_date;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "HospitalPatients [id=" + id + ", name=" + name + ", age=" + age + ", last_visit_date=" + last_visit_date
				+ "]";
	}

}
