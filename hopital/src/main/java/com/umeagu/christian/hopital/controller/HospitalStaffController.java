package com.umeagu.christian.hopital.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umeagu.christian.hopital.hospitalStaff.HospitalStaff;
import com.umeagu.christian.hopital.service.HospitalStaffService;

@RequestMapping("/hospital/hospitalStaff")
@RestController
public class HospitalStaffController {

	@Autowired
	private final HospitalStaffService hospitalStaffService;

	public HospitalStaffController(HospitalStaffService hospitalStaffService) {
		super();
		this.hospitalStaffService = hospitalStaffService;
	}

	@PostMapping
	public void addHospitalStaff(@Validated @NonNull @RequestBody HospitalStaff hospitalStaff) {
		hospitalStaffService.addHospitalStaff(hospitalStaff);
	}

	@GetMapping
	public List<HospitalStaff> getAllHospitalStaff() {

		return hospitalStaffService.getAllHospitalStaff();
	}

	@GetMapping(path = "{id}")
	public HospitalStaff getStaffById(@PathVariable("id") UUID id) {
		return hospitalStaffService.getStaffById(id).orElse(null);
	}

	@DeleteMapping(path = "{id}")
	public void deleteStaffById(@PathVariable("id") UUID id) {
		hospitalStaffService.deleteStaffById(id);
	}

	@PutMapping(path = "{id}")
	public void upDateStaffById(@PathVariable("id") UUID id,
			@Validated @NonNull @RequestBody HospitalStaff updateStaff) {
		hospitalStaffService.updateStaffById(id, updateStaff);
	}

}
