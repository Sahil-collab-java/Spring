package com.RestApiIRTC.Service;

import com.RestApiIRTC.Model.Passenger;
import com.RestApiIRTC.Model.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookingServiceImpl implements BookingService{

    private Map<Integer,Ticket> ticketMap = new HashMap<>();
    private Integer ticketNum =1;



    @Override
    public Ticket bookTicket(Passenger passenger) {

        //LOGIC

        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(passenger,ticket);
        ticket.setTicketCost(200.00);
        ticket.setStatus("Confirm");
        ticket.setTicketNum(ticketNum);
        ticketMap.put(ticketNum,ticket);
        ticketNum++;

        return ticket;
    }

    @Override
    public Ticket getTicket(Integer integer) {
        if(ticketMap.containsKey(integer)){
            return ticketMap.get(integer);
        }
        return null;
    }
}
