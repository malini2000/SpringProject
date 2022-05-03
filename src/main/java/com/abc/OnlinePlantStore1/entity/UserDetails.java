package com.abc.OnlinePlantStore1.entity;



@Embeddable
public class UserDetails {
	private String Name;
	private String houseAddress;
	private String city;
	private long mobileNumber;
	private String email;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String houseAddress, String city, long mobileNumber, String email) {
		super();
		Name = name;
		this.houseAddress = houseAddress;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}