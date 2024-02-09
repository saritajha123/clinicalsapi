package com.sarita.clinicals.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarita.clinicals.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

	List<ClinicalData> findByPatientIdAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);
	
	List<ClinicalData> findByPatientIdAndComponentName(int patientId, String componentName);
	List<ClinicalData> findAllByPatientId(int patientId);

}
