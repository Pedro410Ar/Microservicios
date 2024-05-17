package flight.demo.controller;

import java.util.List;
import java.util.Optional;
import flight.demo.model.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import flight.demo.model.Flight;
import flight.demo.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService; 

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

    @CrossOrigin
    @GetMapping(" ")
    public List<FlightDTO> readFlight(){
        return flightService.findAllflight();
    }

    //vuelo x ID
    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    //trae el dolar
    @GetMapping("/dollar")
    public double getDolar(){
        return flightService.getDolar();
    }

    /*
    @GetMapping("/dollarcard")
    public double getDolarCard(){
        return flightService.getDolarCard();
    }
    */

    //Trae ofertas
    @GetMapping("/sale")
    public List<Flight> saleFlight(@RequestParam Integer offerPrice) {
        return flightService.saleFlight(offerPrice);
    }

    //Trae segun origen
    @GetMapping("/origin")
    public List<Flight> getFlightsByLocations(@RequestParam String origin) {
        return flightService.getByOrigin(origin);
    }

    @GetMapping("/locations")
    public List<Flight> getFlightsByLocations(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.getByOriginAndDestiny(origin, destiny);
    }

    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight){
        return flightService.update(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
   }

}
