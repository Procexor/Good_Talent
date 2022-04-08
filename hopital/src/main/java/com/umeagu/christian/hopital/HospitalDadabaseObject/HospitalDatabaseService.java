package com.umeagu.christian.hopital.HospitalDadabaseObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.umeagu.christian.hopital.hospitalStaff.HospitalStaff;

@Repository("database")
public class HospitalDatabaseService implements HospitalDatabaseInterface {

	private static List<HospitalStaff> database = new ArrayList<>();

	@Override
	public int insertHospitalStaff(UUID id, HospitalStaff hospitalStaff) {
		database.add(new HospitalStaff(id, hospitalStaff.getName(), new Date()));
		return 1;
	}

	@Override
	public List<HospitalStaff> selectAllHospitalStaff() {
		return database;
	}

	@Override
	public Optional<HospitalStaff> selectStaffById(UUID id) {

		return database.stream().filter(hospitalStaff -> hospitalStaff.getId().equals(id)).findFirst();
	}

	@Override
	public int deleteByStaffId(UUID id) {
		Optional<HospitalStaff> checkStaff = selectStaffById(id);
		if (checkStaff.isEmpty()) {
			return 0;
		}
		database.remove(checkStaff.get());
		return 1;
	}

	@Override
	public int updateStaffById(UUID id, HospitalStaff hospitalStaff) {

		return selectStaffById(id)
				.map(staff -> {
					int indexOfHospitalStaffToUpdate = database.indexOf(staff);
					if (indexOfHospitalStaffToUpdate >= 0) {
						database.set(indexOfHospitalStaffToUpdate,
								new HospitalStaff(id, hospitalStaff.getName(), new Date()));
						return 1;
					}
					return 0;
				}).orElse(null);
	}

}
