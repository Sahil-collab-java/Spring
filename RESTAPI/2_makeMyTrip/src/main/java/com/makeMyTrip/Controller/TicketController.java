package com.makeMyTrip.Controller;

import com.makeMyTrip.Model.Passenger;
import com.makeMyTrip.Model.Ticket;
import com.makeMyTrip.Service.MakeMyTripServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

@Controller
public class TicketController {

    @Autowired
    private MakeMyTripServiceImpl makeMyTripService;

    @GetMapping("/")
    public String loadIndex(Model model){
        model.addAttribute("passenger",new Passenger());
        return "index";
    }

    @PostMapping("/book-Ticket")
    public String bookTicket(@ModelAttribute("passenger") Passenger passenger,Model model){
        Ticket ticket = makeMyTripService.bookTicket(passenger);
        model.addAttribute("msg","Your Ticket Booked Number "+ticket.getTicketNum());
        return "index";
    }


    @GetMapping("/view-Ticket")
    public String viewTicket(Model model){
       model.addAttribute("getTicket",new Ticket());
        return "viewTicket";
    }

    @GetMapping("/get-Ticket")
    public String getTicket(@RequestParam Integer ticketNum, Model model){

       Ticket ticket = makeMyTripService.getByTicketNum(ticketNum);
       model.addAttribute("getTicket",ticket);
        return "viewTicket";
    }



}
