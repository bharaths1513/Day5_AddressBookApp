package com.example.Demo.Controller;

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

import com.example.Demo.DTO.AddressBookDTO;

@RestController
@RequestMapping("/Address")
public class AddressBookController {

	/**
	 * Adding Address with Name,City and ZipCode
	 * @param AddressBookDTO 
	 * @return : message and Data
	 */
	@PostMapping("/Add")
	public ResponseEntity<String> AddAddress(@RequestBody AddressBookDTO addressDTO){
		return new ResponseEntity<String>("Created Employee Payroll Data for: "+ addressDTO, HttpStatus.OK);
	}
	
	/**
	 * Finding Address with zipcode
	 * @param zip
	 * @return : message and Zipcode
	 */
	@GetMapping("/get/{zip}")
	public ResponseEntity<String> GetAddressByZipCode(@PathVariable("zip") int zipcode){
		return new ResponseEntity<String>("Get Call Success for Id: "+ zipcode, HttpStatus.OK);
	}
	
	
	/**
	 * Editing Address by ZipCode
	 * @param addressDTO
	 * @return : Updated Address Details
	 */
	@PutMapping("/Edit")
	public ResponseEntity<String> updateAddress(@RequestBody AddressBookDTO addressDTO){
		return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ addressDTO, HttpStatus.OK);
	}
	
	/**
	 * Deleteing Address with zipcode
	 * @param zip
	 * @return : Message With Deleted zipcode
	 */
	@DeleteMapping("/delete/{zip}")
	public ResponseEntity<String> DeleteAddress(@PathVariable("zip") int zip){
		return new ResponseEntity<String>("Delete call success for id: "+ zip, HttpStatus.OK);
	}
}
