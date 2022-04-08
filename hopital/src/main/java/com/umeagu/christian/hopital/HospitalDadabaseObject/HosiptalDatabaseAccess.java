package com.umeagu.christian.hopital.HospitalDadabaseObject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.umeagu.christian.hopital.hospitalStaff.HospitalStaff;


public class HosiptalDatabaseAccess implements HospitalDatabaseInterface {

	@Override
	public int insertHospitalStaff(UUID id, HospitalStaff hospitalStaff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HospitalStaff> selectAllHospitalStaff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<HospitalStaff> selectStaffById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByStaffId(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStaffById(UUID id, HospitalStaff hospitalStaff) {
		// TODO Auto-generated method stub
		return 0;
	}

}
