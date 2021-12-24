package com.example.Demo.DTO;

public class AddressBookDTO {

	private String Name;
	public String City;
	public long ZipCode;

	public AddressBookDTO(String name, String city, long zipCode) {
		Name = name;
		City = city;
		ZipCode = zipCode;
	}

	public String getName() {
		return Name;
	}

	public String getCity() {
		return City;
	}

	public long getZipCode() {
		return ZipCode;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setZipCode(long zipCode) {
		ZipCode = zipCode;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [Name=" + Name + ", City=" + City + ", ZipCode=" + ZipCode + "]";
	}

}
