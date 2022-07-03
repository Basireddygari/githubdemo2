package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.FlightAppEntity;
import com.flight.service.FlightAppService;

@RestController
@RequestMapping("/api/vi")
public class FlightAppController {
	@Autowired
	private FlightAppService service;
	
	@PostMapping("/addflight")
	public String save(@RequestBody FlightAppEntity t) {
		return service.addFlightDetails(t);
	}
	@GetMapping("/fecthflight")
	public List<FlightAppEntity> getALL(){
		return service.getAllFlightDetails();
	}
	

}
