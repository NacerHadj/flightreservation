package com.nasro.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nasro.flightreservation.entities.Flight;
import com.nasro.flightreservation.repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flighId") Long flightId, ModelMap modelMAp) {
		Flight flight = flightRepository.findById(flightId).get();
		modelMAp.addAttribute("flight", flight);	
		return "completeReservation";
	}
}
