package com.umeagu.christian.hopital.patients;

import java.util.UUID;


public interface PatientsDataMethods {


	public int setPatients(UUID id, Patients patients);

	default int setPatients(Patients patient) {
		UUID id = UUID.randomUUID();
		return setPatients(id, patient);
	}

	public Patients fetchAllPatientsUpTo2Years(int age);

}