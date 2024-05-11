package TicketApi.ticket.controller;


import TicketApi.ticket.model.FlightDTO;
import TicketApi.ticket.model.Ticket;
import TicketApi.ticket.service.FlightClient;
import TicketApi.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightClient flightClient;


    @GetMapping("")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/flights")
    public List<FlightDTO> getAllFlights(){
        return flightClient.getAllFlights();
    }


    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

}
