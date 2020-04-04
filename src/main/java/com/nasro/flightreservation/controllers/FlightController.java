package com.nasro.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nasro.flightreservation.entities.Flight;
import com.nasro.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date departureDate,
			ModelMap modelMap) {
//		System.out.println("date:" + departureDate);
//		String pattern = "MM-dd-yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String format = simpleDateFormat.format(departureDate);
//		System.out.println("format:" + format);
		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		System.out.println("taille "+ flights.size());
		modelMap.addAttribute("flights", flights);
		return "displayFlights";
	}
}
