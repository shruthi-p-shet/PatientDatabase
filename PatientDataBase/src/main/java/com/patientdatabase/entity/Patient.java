package com.patientdatabase.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String patientName;
	private String patientDesease;
	private int patientAge;
	private String patientDeseaseStatus;
	private String patientPhn;
	private String patientActivityStatus;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDesease() {
		return patientDesease;
	}

	public void setPatientDesease(String patientDesease) {
		this.patientDesease = patientDesease;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientDeseaseStatus() {
		return patientDeseaseStatus;
	}

	public void setPatientDeseaseStatus(String patientDeseaseStatus) {
		this.patientDeseaseStatus = patientDeseaseStatus;
	}

	public String getPatientPhn() {
		return patientPhn;
	}

	public void setPatientPhn(String patientPhn) {
		this.patientPhn = patientPhn;
	}

	public String getPatientActivityStatus() {
		return patientActivityStatus;
	}

	public void setPatientActivityStatus(String patientActivityStatus) {
		this.patientActivityStatus = patientActivityStatus;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientDesease=" + patientDesease
				+ ", patientAge=" + patientAge + ", patientDeseaseStatus=" + patientDeseaseStatus + ", patientPhn="
				+ patientPhn + ", patientActivityStatus=" + patientActivityStatus + "]";
	}

}
