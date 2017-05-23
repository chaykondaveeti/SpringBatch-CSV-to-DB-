package com.java.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;


@Entity
@Table(name="patient_record")
public class Patient {

	
	private String providerName;
	@Id
	private int providerId;
	private int patientId;
	private String patientDisease;
	//private String diagnosisInfo;
	private String mentalHealth;
	private int patientAge;
	private String smoking;
	private String alcohol;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate treatmentStartDate;
	private int estimatedCost;
	private String gender;
	private String description;
	private String abnormalSymptoms;
	private String patientType;
	private String physicianType;
	
	
	
	
	
	public String getProviderName() {
		return providerName;
	}





	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}





	public int getProviderId() {
		return providerId;
	}





	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}





	public int getPatientId() {
		return patientId;
	}





	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}





	public String getPatientDisease() {
		return patientDisease;
	}





	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}





//	public String getDiagnosisInfo() {
//		return diagnosisInfo;
//	}
//
//
//
//
//
//	public void setDiagnosisInfo(String diagnosisInfo) {
//		this.diagnosisInfo = diagnosisInfo;
//	}





	public String getMentalHealth() {
		return mentalHealth;
	}





	public void setMentalHealth(String mentalHealth) {
		this.mentalHealth = mentalHealth;
	}





	public int getPatientAge() {
		return patientAge;
	}





	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}





	public String getSmoking() {
		return smoking;
	}





	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}





	public String getAlcohol() {
		return alcohol;
	}





	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}





	public LocalDate getTreatmentStartDate() {
		return treatmentStartDate;
	}





	public void setTreatmentStartDate(LocalDate treatmentStartDate) {
		this.treatmentStartDate = treatmentStartDate;
	}





	public int getEstimatedCost() {
		return estimatedCost;
	}





	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public String getAbnormalSymptoms() {
		return abnormalSymptoms;
	}





	public void setAbnormalSymptoms(String abnormalSymptoms) {
		this.abnormalSymptoms = abnormalSymptoms;
	}





	public String getPatientType() {
		return patientType;
	}





	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}





	public String getPhysicianType() {
		return physicianType;
	}





	public void setPhysicianType(String physicianType) {
		this.physicianType = physicianType;
	}





	@Override
	public String toString() {
		return "Patient record [providerName: " + providerName + "providerId: "+ providerId + " patientId: "+patientId+"patientDisease: "
	+patientDisease+"mentalHealth: "+mentalHealth+"patientAge: "+patientAge+"smoking: "+smoking+
	"alcohol: "+alcohol+"Startdate: "+treatmentStartDate+"estimatedCost: "+estimatedCost+"gender: "+gender+"description: "+description+
	"abnormalSymptoms: "+abnormalSymptoms+"patientType: "+patientType+"physicianType: "+physicianType+"]";
	

}
}



