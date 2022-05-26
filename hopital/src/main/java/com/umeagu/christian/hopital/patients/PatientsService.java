package com.umeagu.christian.hopital.patients;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository("pDatabase")
public class PatientsService implements PatientsDataMethods {

	static List<Patients> pDatabase = new ArrayList<>();

	@Override
	public Patients fetchAllPatientsUpTo2Years(int age) {
		Optional<Patients> checkPatientsAge = selectPatientsByAge(age);

		return checkPatientsAge.get();
	}

	private Optional<Patients> selectPatientsByAge(int age) {

		// return pDatabase.stream().filter(patient -> patient.getAge()).findFirst();
		return null;

	}

	@Override
	public int setPatients(UUID id, Patients patient) {
		id = UUID.randomUUID();
		pDatabase.add(new Patients(id, patient.getName(), patient.getAge(), new Date()));
		return 1;
	}

	public List<Patients> getAllPatients() {

		return pDatabase;
	}

}
