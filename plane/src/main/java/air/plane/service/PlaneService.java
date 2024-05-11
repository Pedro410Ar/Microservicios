package air.plane.service;


import air.plane.model.Plane;
import air.plane.utils.PlaneUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {

    /* {
        "flight": null,
            "model": "A-474",
            "id": 3,
            "brand": "Bombardier"
    },
    {
        "flight": null,
            "model": "A-737",
            "id": 4,
            "brand": "Airbus"
    },

    */

    private final List<Plane> planes = new ArrayList<>();


    public Plane createPlane(Plane createPlane) {
        planes.add(createPlane);
        return createPlane;
    }

    public List<Plane> getAllPlanes() {
        return planes;
    }

    /*
    public double getMenu(){
        return planeUtils.fetchMenu().getMenu();
    }

     */



}
