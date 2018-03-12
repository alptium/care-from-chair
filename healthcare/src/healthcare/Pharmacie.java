package healthcare;

public class Pharmacie {
	private String name;
	private int registerNumber; 
	private String city;
	private String cityMunicipality;
	private String phoneNumber;
	private String address;
	private String onlineShoping; 
	private String nameOfOwner;
	
    public Pharmacie(String name, int registerNumber, String city, String cityMunicipality, String phoneNumber, String address, String onlineShoping, String nameOfOwner) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.city = city;
        this.cityMunicipality = cityMunicipality;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.onlineShoping = onlineShoping;
        this.nameOfOwner = nameOfOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityMunicipality() {
        return cityMunicipality;
    }

    public void setCityMunicipality(String cityMunicipality) {
        this.cityMunicipality = cityMunicipality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOnlineShoping() {
        return onlineShoping;
    }

    public void setOnlineShoping(String onlineShoping) {
        this.onlineShoping = onlineShoping;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
}