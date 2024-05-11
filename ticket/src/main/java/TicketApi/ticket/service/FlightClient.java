package TicketApi.ticket.service;


import TicketApi.ticket.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "flight-api")
public interface FlightClient {

    @GetMapping("/flight/t")
    List<FlightDTO> getAllFlights();

}
