package air.plane.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plane {

    private Long ID;
    private FlightDTO flight;
    private String Brand;
    private String model;

}
