package air.plane.service;


import air.plane.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "flight-api")
public interface PlaneClient {


    @GetMapping("/flight/t")
    List<FlightDTO> getAllFlights();

}
