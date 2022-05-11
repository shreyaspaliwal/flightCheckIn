package com.shreyas.flightcheckinintegration;

import com.shreyas.flightcheckinintegration.dto.Reservation;
import com.shreyas.flightcheckinintegration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
