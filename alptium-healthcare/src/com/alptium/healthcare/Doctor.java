package com.alptium.healthcare;

public class Doctor {
	private String firstName;
	private String lastName;
	private int birthYear;
	private boolean isFullTimeEmployee;
	private String specialization;
	private String qualification;
	
	public Doctor(String firstName, String lastName, int birthYear, boolean isFullTimeEmployee, String specialization, String qualification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.isFullTimeEmployee = isFullTimeEmployee;
		this.specialization = specialization;
		this.qualification = qualification;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthyear() {
		return birthYear;
	}
	public void setBirthyear(int birthYear) {
		this.birthYear = birthYear;
	}
	public boolean isFullTimeEmployer() {
		return isFullTimeEmployee;
	}
	public void setFullTimeEmployer(boolean isFullTimeEmployee) {
		this.isFullTimeEmployee = isFullTimeEmployee;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	}
