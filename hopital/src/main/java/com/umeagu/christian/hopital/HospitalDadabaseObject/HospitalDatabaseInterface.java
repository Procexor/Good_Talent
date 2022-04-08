package com.umeagu.christian.hopital.HospitalDadabaseObject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.umeagu.christian.hopital.hospitalStaff.HospitalStaff;

public interface HospitalDatabaseInterface {

	int insertHospitalStaff(UUID id, HospitalStaff hospitalStaff);

	default int insertHospitalStaff(HospitalStaff hospitalStaff) {
		UUID id = UUID.randomUUID();
		return insertHospitalStaff(id, hospitalStaff);

	}

	List<HospitalStaff> selectAllHospitalStaff();

	Optional<HospitalStaff> selectStaffById(UUID id);

	int deleteByStaffId(UUID id);

	int updateStaffById(UUID id, HospitalStaff hospitalStaff);


}
