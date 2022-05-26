package com.umeagu.christian.hopital.HospitalDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.umeagu.christian.hopital.staff.Staff;

@Repository("database")
public class StaffService implements StaffDataMethods {

	private static List<Staff> database = new ArrayList<>();

	@Override
	public int insertStaff(UUID id, Staff hospitalStaff) {
		database.add(new Staff(id, hospitalStaff.getName(), new Date()));
		return 1;
	}
	@Override
	public List<Staff> selectAllHospitalStaff() {
		return database;
	}

	@Override
	public Optional<Staff> selectStaffById(UUID id) {

		return database.stream().filter(hospitalStaff -> hospitalStaff.getId().equals(id)).findFirst();

	}

	@Override
	public int deleteByStaffId(UUID id) {
		Optional<Staff> checkStaff = selectStaffById(id);
		if (checkStaff.isEmpty()) {
			return 0;
		}
		database.remove(checkStaff.get());
		return 1;
	}

	@Override
	public int updateStaffById(UUID id, Staff hospitalStaff) {

		return selectStaffById(id)
				.map(staff -> {
					int indexOfHospitalStaffToUpdate = database.indexOf(staff);
					if (indexOfHospitalStaffToUpdate >= 0) {
						database.set(indexOfHospitalStaffToUpdate,
								new Staff(id, hospitalStaff.getName(), new Date()));
						return 1;
					}
					return 0;
				}).orElse(null);
	}

}
