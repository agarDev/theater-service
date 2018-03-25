package com.theater.theaterservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.theater.theaterservice.service.TheaterBookingServiceImpl;
import com.theater.theaterservice.types.TheaterBookingRequest;
import com.theater.theaterservice.types.TheaterBookingResponse;

/**
 * 
 * @author Mayur Agarkar
 *
 */

@RestController
@RequestMapping("/theater")
public class TheaterBookingController {

	@Autowired
	TheaterBookingServiceImpl TheaterBookingServiceImpl;

	@RequestMapping(value = "/bookings/initiate", method = RequestMethod.POST)
	public ResponseEntity<TheaterBookingResponse> bookTheater(@RequestBody TheaterBookingRequest theaterBookingRequest) {
		return new ResponseEntity<TheaterBookingResponse>(TheaterBookingServiceImpl.bookTheater(theaterBookingRequest), HttpStatus.OK);
	}
}
