package com.vikas.flightcheckin.integration;

import com.vikas.flightcheckin.integration.dto.Reservation;
import com.vikas.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
