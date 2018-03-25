package com.theater.theaterservice.types;

import java.util.List;

public class TheaterBookingRequest {

	private List<Layout> layout = null;
	private List<Guest> guests = null;

	public List<Layout> getLayout() {
		return layout;
	}

	public void setLayout(List<Layout> layout) {
		this.layout = layout;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

}