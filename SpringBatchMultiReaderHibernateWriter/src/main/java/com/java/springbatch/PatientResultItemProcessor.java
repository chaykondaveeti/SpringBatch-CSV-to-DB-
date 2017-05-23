package com.java.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.java.springbatch.model.Patient;

public class PatientResultItemProcessor implements ItemProcessor<Patient, Patient>{

	
	public Patient process(Patient record) throws Exception {
		
		return record;
	}

}
