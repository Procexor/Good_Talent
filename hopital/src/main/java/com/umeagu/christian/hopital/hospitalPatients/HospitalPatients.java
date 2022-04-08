package com.umeagu.christian.hopital.hospitalPatients;

import java.util.Date;
import java.util.UUID;

public class HospitalPatients {

	private final UUID id;
	private String name;
	private int age;
	private Date last_visit_date;


	public HospitalPatients(UUID id, String name, int age, Date last_visit_date) {
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

}
