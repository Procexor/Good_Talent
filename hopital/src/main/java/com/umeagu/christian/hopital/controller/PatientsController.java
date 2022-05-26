package com.umeagu.christian.hopital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umeagu.christian.hopital.patients.Patients;
import com.umeagu.christian.hopital.patients.PatientsService;

@RequestMapping("/hospital/patients")
@RestController
public class PatientsController {

	@Autowired
	private PatientsService patientsService;

	public PatientsController(PatientsService patientsService) {
		super();
		this.patientsService = patientsService;
	}
	@PostMapping
	public void addPatients(@RequestBody Patients patients) {
		patientsService.setPatients(patients);
	}
	@GetMapping
	public List<Patients> getAllPatients() {
		return patientsService.getAllPatients();

	}
	@GetMapping(path = "{age}")
	public Patients getPatientsFrom2Years(@PathVariable("age") int age) {
		return patientsService.fetchAllPatientsUpTo2Years(age);
	}
}
