package com.theater.theaterservice.types;

import java.util.List;

/**
 * 
 * @author Mayur Agarkar
 *
 */
public class TheaterBookingResponse {

	private List<Booking> bookings = null;

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

}