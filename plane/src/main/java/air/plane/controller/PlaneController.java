package air.plane.controller;


import air.plane.model.FlightDTO;
import air.plane.model.Plane;
import air.plane.service.PlaneClient;
import air.plane.service.PlaneService;
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


    @GetMapping("")
    public List<Plane> getAllPlanes(){
        return planeService.getAllPlanes();
    }


    @GetMapping("/flight")
    public List<FlightDTO> getAllFlights(){
        return planeClient.getAllFlights();
    }


    @PostMapping("/add")
    public Plane createPlane (@RequestBody Plane plane){
        return planeService.createPlane(plane);

    }



}
