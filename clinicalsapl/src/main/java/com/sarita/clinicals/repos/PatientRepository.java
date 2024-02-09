package com.sarita.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarita.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	

}
