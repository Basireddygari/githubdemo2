package com.flight.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.FlightEntity;
@Repository
public interface FlightRepo extends JpaRepository<FlightEntity, Long> {

	List<FlightEntity> findByOrigin(String origin);

	List<FlightEntity> findAllByDestination(String destination);

	List<FlightEntity> findAllByOriginAndDestination(String origin, String destination);

	
}
