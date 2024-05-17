package air.plane.service;


import air.plane.model.Plane;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {

    @Autowired
    PlaneClient planeClient;

    /* { "flight": "ID": 3, "model": "A-474", "brand": "Bombardier" },
       { "flight": "ID": 4, "model": "A-737", "brand": "Airbus" },
       { "flight": "ID": 5, "model": "A-797", "brand": "Boeing" },
       { "flight": "ID": 6, "model": "A-797", "brand": "Embraer" },
    */

    private final List<Plane> planes = new ArrayList<>();

    public Plane createPlane(Plane createPlane) {
        planes.add(createPlane);
        return createPlane;
    }

    public List<Plane> getAllPlanes() {
        return planes;
    }

}
