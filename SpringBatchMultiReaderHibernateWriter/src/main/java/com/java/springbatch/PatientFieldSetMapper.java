package com.java.springbatch;

import org.joda.time.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.java.springbatch.model.Patient;

//Interface that is used to map data
public class PatientFieldSetMapper implements FieldSetMapper<Patient>{
	
	//Method used to map data obtained from a FieldSet into an object.
	public Patient mapFieldSet(FieldSet fieldSet) throws BindException {
		Patient record = new Patient();
		
		record.setProviderName(fieldSet.readString(0));
		record.setProviderId(fieldSet.readInt(1));
		record.setPatientId(fieldSet.readInt(2));
	    record.setPatientDisease(fieldSet.readString(3));
	    record.setMentalHealth(fieldSet.readString(4));
		record.setPatientAge(fieldSet.readInt(5));
		record.setSmoking(fieldSet.readString(6));
		record.setAlcohol(fieldSet.readString(7));
		record.setTreatmentStartDate(new LocalDate(fieldSet.readDate(8,"dd/MM/yyyy")));
		record.setEstimatedCost(fieldSet.readInt(9));
		record.setGender(fieldSet.readString(10));
		record.setDescription(fieldSet.readString(11));
		record.setAbnormalSymptoms(fieldSet.readString(12));
		record.setPatientType(fieldSet.readString(13));
		record.setPhysicianType(fieldSet.readString(14));
		
		
		
		return record;
	}

}
