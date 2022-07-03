package com.flight.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flight.dao.FlightAppRepo;
import com.flight.entity.FlightAppEntity;

@Service
public class FlightAppService {
	@Autowired
	private FlightAppRepo repo;

	public String addFlightDetails(FlightAppEntity m) {
		repo.save(m);
		System.out.println(m);
		return "succesfully added fligth details";
	}
	public List<FlightAppEntity> getAllFlightDetails(){
		return repo.findAll();
	}

}
