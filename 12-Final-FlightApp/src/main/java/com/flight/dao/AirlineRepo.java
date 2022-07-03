package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.AirLineEntity;

public interface AirlineRepo extends JpaRepository<AirLineEntity, Integer>{

}
