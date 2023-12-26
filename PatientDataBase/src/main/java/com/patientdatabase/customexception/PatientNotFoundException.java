package com.patientdatabase.customexception;

public class PatientNotFoundException extends RuntimeException {
	private String message;

	public PatientNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
