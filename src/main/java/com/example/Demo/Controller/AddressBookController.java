package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.Service.AddressBookService;

import com.example.Demo.model.AddressBookData;

@RestController
@RequestMapping("/Address")
public class AddressBookController {

	@Autowired
	private AddressBookService service;

	/**
	 * Adding Address with Slno,Name,City And Zipcode
	 * 
	 * @param addressdata
	 * @return : in ResponseDTO, Message and data
	 */

	@PostMapping("/Add")
	public ResponseEntity<ResponseDTO> AddEmployeeData(@RequestBody AddressBookData addressdata) {
		addressdata = service.AddEmployeeData(addressdata);
		ResponseDTO respDTO = new ResponseDTO("Created Address", addressdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Finding Address With Slno
	 * 
	 * @param Slno
	 * @return : in ResponseDTO, Message and data - Slno
	 */

	@GetMapping("/Find/{Slno}")
	public ResponseEntity<ResponseDTO> GetEmployeeData(@PathVariable int Slno) {
		AddressBookData addressdata = null;
		addressdata = service.FindEmployeeData(Slno);
		ResponseDTO respDTO = new ResponseDTO("Address Found ", addressdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * To Find All Data In List
	 * 
	 * @return : Data List
	 */
	@GetMapping("/FindAll")
	public ResponseEntity<ResponseDTO> FindAllData() {
		List<AddressBookData> addresslist = null;
		addresslist = service.FindData();
		ResponseDTO respDTO = new ResponseDTO("Address List", addresslist);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Updating Address
	 * 
	 * @param addressdata
	 * @return : Updated Address
	 */

	@PutMapping("/Edit")
	public ResponseEntity<ResponseDTO> EditEmployeeData(@RequestBody AddressBookData addressdata) {
		addressdata = service.updateEmployeeData(addressdata);
		ResponseDTO respDTO = new ResponseDTO("Address updated Successfully", addressdata);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * Deleting Address With Slno
	 * 
	 * @param Slno
	 * @return : Message and Deleted Slno
	 */

	@DeleteMapping("/Delete/{Slno}")
	public ResponseEntity<ResponseDTO> DeleteEmployeData(@PathVariable int Slno){
		service.DeleteData(Slno);
		ResponseDTO respDTO = new ResponseDTO("Address Deleted Successfully","Deleted Id:"+Slno);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
