package com.patientdatabase.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.patientdatabase.customexception.PatientNotFoundException;
import com.patientdatabase.entity.Patient;
import com.patientdatabase.repository.PatientRepository;
import com.patientdatabase.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository repo;

	// This method will save data to database
	@Override
	public Patient saveData(Patient patient) {
		if(patient.getPatientActivityStatus().equals("In-Hospital")) {
			repo.save(patient);
			return patient;
			
		}else {
			repo.delete(patient);
		return null;
		}
	}

	// This method will update the change made to the existing row of database based
	// on id
	@Override
	public Patient updateData(Patient patient, int id) {
		Optional<Patient> opPatient = repo.findById(id);
		if (opPatient.isPresent()) {
			Patient presentPatient = patient;
			presentPatient.setPatientId(id);
			repo.save(presentPatient);
			return presentPatient;
		} else {
			return null;
		}

	}

	// This method used to retrieving data from database
	@Override
	public List<Patient> getAllData() {
		List<Patient> list = repo.findAll();
		if (list.size() != 0) {
			for (Patient p : list) {
				String activity = p.getPatientActivityStatus();
				if (activity.equals("Discharged")) {
					repo.delete(p);
				}
			}
			return list;
		} else {
			return null;

		}
	}

	// Used to retrieve single entry from database based on id
	@Override
	public Patient getPatient(int id) {
		Optional<Patient> opPatient = repo.findById(id);
		if (opPatient.isPresent()) {
			Patient presentPatient = opPatient.get();
			return presentPatient;
		} else {
			return null;
		}

	}

	// Used to delete the single row of database based on id
	@Override
	public Patient deleteData(int id) {
		Optional<Patient> opPatient = repo.findById(id);
		if (opPatient.isPresent()) {
			Patient patient = opPatient.get();
			repo.delete(patient);
			return patient;
		} else {
			return null;
		}
	}
}
