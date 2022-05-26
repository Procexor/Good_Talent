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

import com.umeagu.christian.hopital.staff.Staff;
import com.umeagu.christian.hopital.staff.StaffServ;

@RequestMapping("/hospital/staff")
@RestController
public class StaffController {

	@Autowired
	private final StaffServ staffService;

	public StaffController(StaffServ staffService) {
		super();
		this.staffService = staffService;
	}

	@PostMapping
	public void addStaff(@Validated @RequestBody Staff hospitalStaff) {
		staffService.addStaff(hospitalStaff);

	}

	@GetMapping
	public List<Staff> getAllHospitalStaff() {

		return staffService.getAllHospitalStaff();
	}

	@GetMapping(path = "{id}")
	public Staff getStaffById(@PathVariable("id") UUID id) {
		return staffService.getStaffById(id).orElse(null);
	}

	@DeleteMapping(path = "{id}")
	public void deleteStaffById(@PathVariable("id") UUID id) {
		staffService.deleteStaffById(id);
	}

	@PutMapping(path = "{id}")
	public void upDateStaffById(@PathVariable("id") UUID id,
			@Validated @NonNull @RequestBody Staff updateStaff) {
		staffService.updateStaffById(id, updateStaff);
	}

}
