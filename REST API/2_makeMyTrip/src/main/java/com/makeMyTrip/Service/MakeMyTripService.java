package com.makeMyTrip.Service;

import com.makeMyTrip.Model.Passenger;
import com.makeMyTrip.Model.Ticket;

public interface MakeMyTripService {

    public Ticket bookTicket(Passenger passenger);

    public Ticket getByTicketNum(Integer ticketNum);
}
