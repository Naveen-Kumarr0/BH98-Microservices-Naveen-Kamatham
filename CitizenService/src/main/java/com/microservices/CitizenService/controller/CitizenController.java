package com.microservices.CitizenService.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.CitizenService.entity.Citizen;
import com.microservices.CitizenService.repository.Citizenrepo;


@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private Citizenrepo repo; 

	@RequestMapping(path ="/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("hello", HttpStatus.OK);
	}
	
	@RequestMapping(path ="/id/{id}")
	public List<Citizen> getByid(@PathVariable Integer id){
		List<Citizen> lsc = repo.findByVaccinationCenterId(id);
		return lsc ; 
	}
//	public ResponseEntity<java.util.List<Citizen>> getById(@PathVariable Integer id) {
//		
//		List<Citizen> listCitizen = repo.findByVaccinationCenterId(id);
//		return new ResponseEntity<>(listCitizen, HttpStatus.OK);
//	}
	
	@PostMapping(path ="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
		
		Citizen citizen = repo.save(newCitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}
	
	
	
}