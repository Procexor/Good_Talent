package com.umeagu.christian.hopital.staff;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umeagu.christian.hopital.HospitalDatabase.StaffDataMethods;

@Service
public class StaffServ {

	@Autowired
	private final StaffDataMethods staffDataMethod;

	public StaffServ(StaffDataMethods staffDataMethod) {
		super();
		this.staffDataMethod = staffDataMethod;
	}


	public int addStaff(Staff hospitalStaff) {
		return staffDataMethod.insertHospitalStaff(hospitalStaff);
	}

	public List<Staff> getAllHospitalStaff() {
		return staffDataMethod.selectAllHospitalStaff();
	}

	public Optional<Staff> getStaffById(UUID id) {

		return staffDataMethod.selectStaffById(id);
	}

	public int deleteStaffById(UUID id) {

		return staffDataMethod.deleteByStaffId(id);
	}

	public int updateStaffById(UUID id, Staff updateStaff) {
		return staffDataMethod.updateStaffById(id, updateStaff);
	}
}
