package com.theater.theaterservice.service;

import com.theater.theaterservice.types.TheaterBookingRequest;
import com.theater.theaterservice.types.TheaterBookingResponse;

/**
 * 
 * @author Mayur Agarkar
 *
 */
public interface TheaterBookingService {
	public TheaterBookingResponse bookTheater(TheaterBookingRequest theaterBookingRequest);
}
