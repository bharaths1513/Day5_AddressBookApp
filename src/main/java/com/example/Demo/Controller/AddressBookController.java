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


import com.example.Demo.DTO.ResponseDTO;
import com.example.Demo.model.AddressBookData;

@RestController
@RequestMapping("/Address")
public class AddressBookController {

	/**
	 * Adding Address with Slno,Name,City And Zipcode 
	 * @param addressdata
	 * @return : in ResponseDTO, Message and data
	 */

	@PostMapping("/Add")
	public ResponseEntity<ResponseDTO> AddAddress(@RequestBody AddressBookData addressdata){
		ResponseDTO respDTO = new ResponseDTO("Created Address ",addressdata);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Finding Address With Slno
	 * @param Slno
	 * @return : in ResponseDTO, Message and data - Slno
	 */
	
	@GetMapping("/Find/{Slno}")
	public ResponseEntity<ResponseDTO> GetEmployeeData(@PathVariable int Slno){
		ResponseDTO respDTO = new ResponseDTO("Address Found ",Slno);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Updating Address 
	 * @param addressdata
	 * @return : Updated Address
	 */
	
	@PutMapping("/Edit")
	public ResponseEntity<ResponseDTO> EditEmployeeData(@RequestBody AddressBookData addressdata){
		ResponseDTO respDTO = new ResponseDTO("Address Updated Successfully",addressdata);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	/**
	 * Deleting Address With Slno
	 * @param Slno
	 * @return : Message and Deleted Slno
	 */
	
	@DeleteMapping("/Delete/{Slno}")
	public ResponseEntity<ResponseDTO> DeleteEmployeData(@PathVariable int Slno){
		ResponseDTO respDTO = new ResponseDTO("Address Deleted Successfully","Deleted Id:"+Slno);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
