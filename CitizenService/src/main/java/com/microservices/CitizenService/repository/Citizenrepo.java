package com.microservices.CitizenService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.CitizenService.entity.Citizen;

public interface Citizenrepo extends JpaRepository<Citizen, Integer> {
	
	public List<Citizen> findByVaccinationCenterId(Integer id);

}
