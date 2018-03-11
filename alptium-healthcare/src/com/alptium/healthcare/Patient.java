package com.alptium.healthcare;

public class Patient {
	
	private String name;
	private String surname;
	private String parentName;
	private String jmbg;
	private String dateOfBirth;
	private String placeOfBirth;
	private String gender;
	private String id;
	private String address;
	private String town;
	private String citizenship;
	private String phoneNumber;

	
	public Patient(String name, String parentName, String surname, String jmbg, String dateOfBirth, String placeOfBirth, String gender, String id, String address, String town, String citizenship, String phoneNumber ) {
		this.name = name;
		this.parentName = parentName;
		this.surname = surname;
		this.jmbg = jmbg;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.gender = gender;
		this.id = id;
		this.address = address;
		this.town = town;
		this.citizenship = citizenship;
		this.phoneNumber = phoneNumber;
		
	}
	
	public Patient(String name, String parentName, String surname, String jmbg, String id) {
		this.name = name;
		this.parentName = parentName;
		this.surname = surname;
		this.jmbg = jmbg;
		this.id = id;
	}
	
	protected void checkJmbg(String jmbg) {
		
		if (jmbg.length()!= 13) {
			throw new IllegalArgumentException();
			}
	}
	public void setJmbg(String jmbg) {
		
		try{
		checkJmbg(jmbg);
		this.jmbg = jmbg;
		}
		catch(IllegalArgumentException e) {
		System.out.println("JMBG must be 13 character long");
		System.exit(1);
		}
		
	}
	
	public String getJmbg() {
		return jmbg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTown() {
		return town;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}

