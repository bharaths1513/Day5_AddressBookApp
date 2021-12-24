package com.example.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {


	@Override
	public AddressBookData AddEmployeeData(AddressBookData addressdata) {
		
		return addressdata;
	}

	@Override
	public AddressBookData FindEmployeeData(int Slno) {
		AddressBookData addressdata =null;
		addressdata = new AddressBookData(1,"Bharath S","Channagiri",577213);
		return addressdata;
	}

	@Override
	public List<AddressBookData> FindData() {
		List<AddressBookData> addresslist = new ArrayList<AddressBookData>();
		addresslist.add(new AddressBookData());
		return addresslist;
	}

	@Override
	public AddressBookData updateEmployeeData(AddressBookData addressdata) {
		addressdata = new AddressBookData(1,"Bharath","Davanagere",577215);
		return addressdata;
	}

	@Override
	public void DeleteData(int Slno) {
		
		
	}
}
