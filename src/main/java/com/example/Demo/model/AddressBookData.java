package com.example.Demo.model;

public class AddressBookData {

	private int Slno;
	private String Name;
	private String City;
	private long ZipCode;

	public AddressBookData( int Slno, String Name, String City, long ZipCode) {
		this.Slno = Slno;
		this.Name = Name;
		this.City = City;
		this.ZipCode = ZipCode;
	}

	public int getSlno() {
		return Slno;
	}

	public void setSlno(int slno) {
		Slno = slno;
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
		return "AddressBookDTO [Slno=" + Slno + ", Name=" + Name + ", City=" + City + ", ZipCode=" + ZipCode + "]";
	}

}
