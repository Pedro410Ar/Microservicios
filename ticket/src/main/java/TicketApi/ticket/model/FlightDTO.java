package TicketApi.ticket.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FlightDTO {
    private Long id;
    private String origin;
    private String destiny;
    //private String departureTime;
    //private String arrivingTime;
    private double converterPrice;
    //private String frequency;
    //private String company;

}
