package com.patientdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientdatabase.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
