package com.RestApiIRTC.Service;

import com.RestApiIRTC.Model.Passenger;
import com.RestApiIRTC.Model.Ticket;

public interface BookingService {

    public Ticket bookTicket(Passenger passenger);

    public Ticket getTicket(Integer integer);
}
