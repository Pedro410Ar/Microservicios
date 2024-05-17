package TicketApi.ticket.service;


import TicketApi.ticket.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "flight-service")
public interface FlightClient {

    @GetMapping("/flight")
    List<FlightDTO> readFlights();

    @GetMapping("/flight/dollar")
    double getDolar();

    @GetMapping("/flight/{id}")
    Optional<FlightDTO> getFlightById();


}
