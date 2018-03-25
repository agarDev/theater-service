package com.theater.theaterservice.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.theater.theaterservice.types.Booking;
import com.theater.theaterservice.types.Guest;
import com.theater.theaterservice.types.Layout;
import com.theater.theaterservice.types.Section;

@Component
public class BookingUtils {

	Boolean isCustomerSet = false;
	int totalCapacity;
	int maxContinuousLength;
	public void createBooking(Booking booking, Guest guest, List<Layout> layouts) {
		
		//calculate prerequisites
		findTotalCapacity(layouts);
		
		//book as per base cases
		for(Layout layout : layouts) {
			if(matchAndBookInSection(booking, layout.getSections(), guest.getBookingRequest())) {
				booking.setRow(layout.getRow());
				isCustomerSet = true;
				break;
			}
		}
		
		//edge case here as we failed to book customer
		if(guest.getBookingRequest() > totalCapacity && !isCustomerSet) {
			booking.setErrorMessage("Sorry, we can't handle your party.");
		}else if(guest.getBookingRequest() < totalCapacity && guest.getBookingRequest() > maxContinuousLength && !isCustomerSet){
			booking.setErrorMessage("Call to split party.");
		}
	}

	private void findTotalCapacity(List<Layout> layouts) {
		//initialize
		totalCapacity = 0;
		maxContinuousLength = 0;

		for (Layout layout : layouts) {
			for(Section section : layout.getSections()) {
				int sectionCapacity = section.getSectionCapacity().intValue();
				totalCapacity += sectionCapacity;
				if(maxContinuousLength <= sectionCapacity) {
					maxContinuousLength = sectionCapacity;
				}
			}
		}
		isCustomerSet = false;
	}

	private boolean matchAndBookInSection(Booking booking, List<Section> sections, Integer bookingRequest) {
		for(Section section : sections) {
			if(section.getSectionCapacity() >= bookingRequest) {
				section.setSectionCapacity(section.getSectionCapacity() - bookingRequest);
				booking.setSection(section.getSectionNumber());
				return true;
			}
		}
		return false;
	}

}
