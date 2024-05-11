package TicketApi.ticket.service;

import TicketApi.ticket.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private final List<Ticket> tickets = new ArrayList<>();

    /*
    tickets.add(null , 1L, "Pedro", "choto@gmail.com", "022EE");
    tickets.add(null, 2, "Juan", "pepe@gmail.com", "044GG");
    tickets.add(null, 3, "Maria", "mary@gmail.com", "779GG");
    */

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket addTicket(Ticket addedTicket) {
        tickets.add(addedTicket);
        return addedTicket;
    }
}
