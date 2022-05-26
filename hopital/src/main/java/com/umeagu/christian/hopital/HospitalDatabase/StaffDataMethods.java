package com.umeagu.christian.hopital.HospitalDatabase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.umeagu.christian.hopital.staff.Staff;

public interface StaffDataMethods {

	int insertStaff(UUID id, Staff hospitalStaff);

	default int insertHospitalStaff(Staff hospitalStaff) {
		UUID id = UUID.randomUUID();
		return insertStaff(id, hospitalStaff);
	}

	List<Staff> selectAllHospitalStaff();

	Optional<Staff> selectStaffById(UUID id);

	int deleteByStaffId(UUID id);

	int updateStaffById(UUID id, Staff hospitalStaff);


}
