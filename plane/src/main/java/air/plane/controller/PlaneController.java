package air.plane.controller;


import air.plane.model.FlightDTO;
import air.plane.model.Plane;
import air.plane.model.TicketDTO;
import air.plane.service.PlaneClient;
import air.plane.service.PlaneService;
import air.plane.service.TicketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @Autowired
    private PlaneClient planeClient;

    @Autowired
    private TicketClient ticketClient;


    @GetMapping("")
    public List<Plane> getAllPlanes(){
        return planeService.getAllPlanes();
    }

    @PostMapping("/add")
    public Plane createPlane (@RequestBody Plane plane){
        return planeService.createPlane(plane);
    }

    //Traigo Flights desde Flight-API
    @GetMapping("/flights")
    public List<FlightDTO> getAllFlights(){
        return planeClient.readFlights();
    }

    //Traigo el dolar desde Flight-API
    @GetMapping("/dollar")
    public double getDolar(){
        return planeClient.getDolar();
    }

    //Traigo tickets desde Ticket-API
    @GetMapping("/tickets")
    public List<TicketDTO> getAllTickets(){
        return ticketClient.getAllTickets();
    }










}
