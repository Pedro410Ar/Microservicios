package air.plane.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Plane {

    private Long ID;
    private FlightDTO flightDTO;
    private String brand;
    private String model;

}
