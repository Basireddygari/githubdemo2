package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.FlightAppEntity;

public interface FlightAppRepo extends JpaRepository<FlightAppEntity, Integer>{

}
