package TicketApi.ticket.controller;


import TicketApi.ticket.model.FlightDTO;
import TicketApi.ticket.model.Ticket;
import TicketApi.ticket.service.FlightClient;
import TicketApi.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightClient flightClient;

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

    @GetMapping("")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
    }

    //Traigo Vuelos desde Flight-API
    @GetMapping("/flights")
    public List<FlightDTO> getAllFlights(){
        return flightClient.readFlights();
    }

    //Traigo el dolar desde Flight-API
    @GetMapping("/dollar")
    public double getDolar(){
        return flightClient.getDolar();
    }

    @GetMapping("/flight/{id}")
    public Optional<FlightDTO> findFlightById(@PathVariable Long id) {
        return flightClient.getFlightById();
    }


}
