package com.makeMyTrip.Service;

import com.makeMyTrip.Model.Passenger;
import com.makeMyTrip.Model.Ticket;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

    private String BOOK_TICKET_URL = "http://localhost:8080/ticket";
    private String GET_TICKET_URL = "http://localhost:8080/ticket/{ticketNum}";

    @Override
    public Ticket bookTicket(Passenger passenger) {
//        RestTemplate restTemplate = new RestTemplate();
//     ResponseEntity<Ticket> ticketResponseEntity = restTemplate.postForEntity(BOOK_TICKET_URL,passenger,Ticket.class);
//      Ticket ticket =  ticketResponseEntity.getBody();
//        return ticket;


        WebClient webClient = WebClient.create();

       Ticket ticket = webClient.post().
                uri(BOOK_TICKET_URL).
               bodyValue(passenger).
                retrieve().
                bodyToMono(Ticket.class).
                block();//syn call
        return ticket;
    }

    @Override
    public Ticket getByTicketNum(Integer ticketNum) {
//        RestTemplate restTemplate =  new RestTemplate();
//       ResponseEntity<Ticket> ticketResponseEntity = restTemplate.getForEntity(GET_TICKET_URL, Ticket.class,ticketNum);
//       Ticket ticket =  ticketResponseEntity.getBody();
//       return ticket;
        WebClient webClient = WebClient.create();

        Ticket ticket =
              webClient.get().
                uri(GET_TICKET_URL,ticketNum).
                retrieve().
                bodyToMono(Ticket.class).
                block();//syn call
         return ticket;
    }
}
