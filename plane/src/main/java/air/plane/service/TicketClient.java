package air.plane.service;

import air.plane.model.FlightDTO;
import air.plane.model.TicketDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ticket-service")
public interface TicketClient {

    @GetMapping("/tickets")
    List<TicketDTO> getAllTickets();
}
