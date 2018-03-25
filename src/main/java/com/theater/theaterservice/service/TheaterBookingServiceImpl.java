package com.theater.theaterservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.theater.theaterservice.types.Booking;
import com.theater.theaterservice.types.Guest;
import com.theater.theaterservice.types.Layout;
import com.theater.theaterservice.types.TheaterBookingRequest;
import com.theater.theaterservice.types.TheaterBookingResponse;
import com.theater.theaterservice.utils.BookingUtils;

/**
 * 
 * @author Mayur Agarkar
 *
 */
@Component
public class TheaterBookingServiceImpl implements TheaterBookingService {
	
	@Autowired
	BookingUtils util;

	@Override
	public TheaterBookingResponse bookTheater(TheaterBookingRequest theaterBookingRequest) {
		
		TheaterBookingResponse theaterBookingResponse = new TheaterBookingResponse();
		List<Booking> bookings = new ArrayList<Booking>();
		
		//get all guests
		List<Guest> guests = theaterBookingRequest.getGuests();
		
		//get layout
		List<Layout> layout = theaterBookingRequest.getLayout();
		
		//for each guest make booking
		for(Guest guest : guests) {
			
			Booking booking = new Booking();
			booking.setCustomerName(guest.getGuestName());
			util.createBooking(booking, guest, layout);
			bookings.add(booking);
		}
		theaterBookingResponse.setBookings(bookings);
		return theaterBookingResponse;
	}

}
