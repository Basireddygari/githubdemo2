package com.flight.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightRepo;
import com.flight.entity.BookingEntity;
import com.flight.entity.FlightEntity;
import com.flight.exception.TicketNotFoundException;

@Service
public class FlightService {
	@Autowired
	private FlightRepo repo;
	
	public String save(FlightEntity f){
		repo.save(f);
		return "succesfully  registered";
	}
	public List<FlightEntity> findAllFlights(){
		return repo.findAll();
	}

	public List<FlightEntity> findAllByOrigin(String origin) throws TicketNotFoundException {
		List<FlightEntity> optional = repo.findByOrigin(origin);
		return optional;
		}
		
	public List<FlightEntity> findAllByDestinationn(String destination) throws TicketNotFoundException {
		List<FlightEntity> optional = repo.findAllByDestination(destination);
		return optional;
		}
	public List<FlightEntity> findAllByOriginAndDestinationn(String origin,String destination) throws TicketNotFoundException {
		List<FlightEntity> optional = repo.findAllByOriginAndDestination(origin,destination);
		return optional;
		}

	
	
}
