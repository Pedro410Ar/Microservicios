package TicketApi.ticket.service;

import TicketApi.ticket.model.FlightDTO;
import TicketApi.ticket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    FlightClient flightClient;

    private final List<Ticket> tickets = new ArrayList<>();

    /*
    tickets.add(null , 1L, "Pedro", "chocho@gmail.com", "022EE");
    tickets.add(null, 2, "Juan", "pepe@gmail.com", "044GG");
    tickets.add(null, 3, "Maria", "mary@gmail.com", "779GG");
    */

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket addTicket(Ticket addTicket) {
        tickets.add(addTicket);
        return addTicket;
    }


    public Ticket addTicketId(Ticket addTicketId, Long id) {
        // Obtener el vuelo correspondiente por su ID
        FlightDTO flightToTicket = flightClient.getFlightById()
                .orElseThrow(() -> new RuntimeException("Flight with id " + id + " not found"));

        // Establecer el FlightDto en el ticket
        //tickets.setFlightDTO(flightToTicket);

        //Agrego el ticket al array
        tickets.add(addTicketId);

        //Muestro el ticket
        return addTicketId;
    }



    public List<Ticket> deleteTicket(@PathVariable Long id) {
       tickets.remove(id);
       return tickets;
    }




}
