package com.umeagu.christian.hopital.hospitalStaff;

import java.util.Date;
import java.util.UUID;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HospitalStaff {

	private final UUID id;

	@NonNull
	private String name;
	private Date registration_date;

	public HospitalStaff(@JsonProperty("id") UUID id, @JsonProperty("name") String name,
			@JsonProperty("registration_date") Date registration_date) {
		super();
		this.id = id;
		this.name = name;
		this.registration_date = registration_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "HospitalStaff [id=" + id + ", name=" + name + ", registration_date=" + registration_date
				+ ", getName()=" + getName() + ", getRegistration_date()=" + getRegistration_date() + ", getId()="
				+ getId() + "]";
	}

}
