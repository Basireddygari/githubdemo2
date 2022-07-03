package com.flight.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dao.BookingRepo;
import com.flight.entity.BookingEntity;
import com.flight.entity.FlightAppEntity;
import com.flight.exception.TicketNotFoundException;
import com.flight.service.BookingService;

@Transactional
@RestController
@RequestMapping("/api/v1.0/flight")
public class BookingController {
	@Autowired
	private BookingService service;

		@PostMapping("/booking/{flightid}")
		public String ticketResponse(@RequestBody BookingEntity t,@PathVariable Integer flightid) {
			return service.bookTicket(t, flightid);
		}
		@GetMapping("/fecthAllbookingDetails")
		public List<BookingEntity> getALL(){
			return service.getAllBooks();
		}
		@GetMapping("/ticket/{pnr}")
		public BookingEntity fecthPnr(@PathVariable String pnr) throws TicketNotFoundException {
			return service.getBookingDetailsByPnr(pnr);
		}
		@GetMapping("/booking/history/{mail}")
		public BookingEntity fecthMail(@PathVariable String mail) throws TicketNotFoundException {
			return service.getTicketDetailsByMail(mail);
		}
		
		@DeleteMapping("/booking/cancel/{pnr}")
		public String deletePnr(@PathVariable String pnr) throws TicketNotFoundException {
			return service.cancelTicket(pnr);
		}
}
