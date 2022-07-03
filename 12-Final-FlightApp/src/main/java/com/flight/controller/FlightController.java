package com.flight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.AirLineEntity;
import com.flight.entity.FlightEntity;
import com.flight.exception.TicketNotFoundException;
import com.flight.service.AirlineService;
import com.flight.service.FlightService;


@RestController
public class FlightController {
	@Autowired
	private AirlineService service;
	@Autowired
	private FlightService flightService;
	@PostMapping(path="/api/v1.0/flight/airline/register")
	public ResponseEntity<String> registerAirline(@RequestBody AirLineEntity airline) {
		return new ResponseEntity<String>(service.registerAirline(airline),HttpStatus.OK);		
	}
	@GetMapping(path="/api/v1.0/flight/airline/all")
	public List<AirLineEntity> airlinesAll() {
		
	    return service.findAll();
	}
	@GetMapping(path="/api/v1.0/flight/all")
	public List<FlightEntity> flightsAll() {
		
	    return flightService.findAllFlights();
	}
	@PostMapping(path="/api/v1.0/flight/airline/inventory/add")
	public ResponseEntity<String> saveFlightDetail(@RequestBody FlightEntity flight) {
		return new ResponseEntity<String>(flightService.save(flight),HttpStatus.OK);
		}
		@GetMapping(path="/flight-search")
	public List<FlightEntity> flights(@RequestParam("origin") String origin, @RequestParam("destination") String destination) throws TicketNotFoundException {
		System.out.println("Parameters are there...");
		
	
		return flightService.findAllByOriginAndDestinationn(origin, destination);
		//return service.findAllByOriginDestinationAndDateOfFlight(origin, destination, dof);
	}
}
