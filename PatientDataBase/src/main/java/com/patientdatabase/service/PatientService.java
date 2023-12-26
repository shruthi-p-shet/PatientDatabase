package com.patientdatabase.service;

import java.util.List;
import com.patientdatabase.entity.Patient;

public interface PatientService {
	// This method will save data to database
	public Patient saveData(Patient p);

	// This method will update the change made to the existing row of database based
	// on id
	public Patient updateData(Patient patient, int id);

	// This method used to retrieving data from database
	public List<Patient> getAllData();

	// Used to retrieve single entry from database based on id
	public Patient getPatient(int id);

	// Used to delete the single row of database based on id
	public Patient deleteData(int id);

}
