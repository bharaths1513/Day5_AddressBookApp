package com.example.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.AddressBookData;

@Service
public interface IAddressBookService {

	AddressBookData AddEmployeeData(AddressBookData addressdata);
	AddressBookData FindEmployeeData(int Slno);
	List<AddressBookData>FindData();
	AddressBookData updateEmployeeData(AddressBookData addressdata);
	void DeleteData(int Slno);
}
