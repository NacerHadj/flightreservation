package com.nasro.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
