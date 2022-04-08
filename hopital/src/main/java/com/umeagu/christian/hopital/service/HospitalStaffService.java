package com.umeagu.christian.hopital.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umeagu.christian.hopital.HospitalDadabaseObject.HospitalDatabaseInterface;
import com.umeagu.christian.hopital.hospitalStaff.HospitalStaff;

@Service
public class HospitalStaffService {

	@Autowired
	private final HospitalDatabaseInterface hospitalDatabaseInterface;

	public HospitalStaffService(HospitalDatabaseInterface hospitalDatabaseInterface) {
		super();
		this.hospitalDatabaseInterface = hospitalDatabaseInterface;
	}


	public int addHospitalStaff(HospitalStaff hospitalStaff) {
		return hospitalDatabaseInterface.insertHospitalStaff(hospitalStaff);
	}

	public List<HospitalStaff> getAllHospitalStaff() {
		return hospitalDatabaseInterface.selectAllHospitalStaff();
	}

	public Optional<HospitalStaff> getStaffById(UUID id) {

		return hospitalDatabaseInterface.selectStaffById(id);
	}

	public int deleteStaffById(UUID id) {

		return hospitalDatabaseInterface.deleteByStaffId(id);
	}

	public int updateStaffById(UUID id, HospitalStaff updateStaff) {
		return hospitalDatabaseInterface.updateStaffById(id, updateStaff);
	}
}
