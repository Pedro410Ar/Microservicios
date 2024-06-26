package air.plane.service;

import air.plane.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "flight-service")
public interface PlaneClient {

    @GetMapping("/flight")
    List<FlightDTO> readFlights();

    @GetMapping("/flight/dollar")
    double getDolar();





}
