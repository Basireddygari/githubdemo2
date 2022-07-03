package com.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.BookingRepo;
import com.flight.dao.FlightAppRepo;
import com.flight.entity.BookingEntity;
import com.flight.entity.FlightAppEntity;
import com.flight.exception.TicketNotFoundException;
@Service
public class BookingService {
	@Autowired
	private FlightAppRepo frepo;
	@Autowired
	private BookingRepo repo;

public String bookTicket(BookingEntity m,int id) {
	//System.out.println("************");
	Optional<FlightAppEntity> findById = frepo.findById(id);
	if(findById.isEmpty()) {
		return "invalid";
	}else {
		String p="PNR";
			//for(int i=1;i<=3;i++) {
				p=p+(int)(Math.random());
			//}
			System.out.println(p);
		
	m.setPnr(p);
	m.setFlightid(id);
	repo.save(m);
	return p;
	}
}

public List<BookingEntity> getAllBooks(){
	return repo.findAll();
}

public BookingEntity getBookingDetailsByPnr(String pnr) throws TicketNotFoundException {
	Optional<BookingEntity> optional = repo.findByPnr(pnr);
	if(optional.isEmpty()) {
		throw new TicketNotFoundException("ticket with id: "+pnr+" not available in database");
		//return pnr+"value is in valid";
	} else {
		return optional.get();
	}
	}
	public BookingEntity getTicketDetailsByMail(String mail) throws TicketNotFoundException {
		Optional<BookingEntity> optional = repo.findByMail(mail);
		if(optional.isEmpty()) {
			throw new TicketNotFoundException("ticket with mail: "+mail+" not available in database");
		} else {
			System.out.println(optional);
			return optional.get();
		}	
	
		}
	public String cancelTicket(String pnr) {
		System.out.println("************");
		Optional<BookingEntity> findById = repo.findByPnr(pnr);
		if(findById.isEmpty()) {
			return "invalid";
		}else {
			System.out.println("DDDDDDDDDD");
			repo.deleteByPnr(pnr);
			
			return "succesfully deleted----";
		}
	}


}
