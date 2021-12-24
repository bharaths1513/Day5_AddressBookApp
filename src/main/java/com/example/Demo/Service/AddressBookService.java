package com.example.Demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {



	private List<AddressBookData> addresslist = new ArrayList<>();

	@Override
	public AddressBookData AddEmployeeData(AddressBookData addressdata) {
		addresslist.add(addressdata);
		return addressdata;
	}

	@Override
	public AddressBookData FindEmployeeData(int empId) {
		return addresslist.get(empId - 1);
	}

	@Override
	public List<AddressBookData> FindData() {
		return addresslist;
	}

	@Override
	public AddressBookData updateEmployeeData(AddressBookData empdata) {
		addresslist.set(1, empdata);
		return empdata;
	}

//	@Override
//	public EmployeePayrollData updateEmployeeData( EmployeePayrollData empdata) {
//		int empId=0;
//		empdata.setEmpId(empId);
//		String name = "";
//		empdata=empdata.setEmpName(name);
//		long salary = 0;
//		empdata=empdata.setEmpSalary(salary);
//		
//		emplist.set(empId-1,empdata);
//		return empdata;
//	}

	@Override
	public void DeleteData(int empId) {
		addresslist.remove(empId - 1);

	}

	
}
