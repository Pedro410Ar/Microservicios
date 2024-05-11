package TicketApi.ticket.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private String origin;
    private String destiny;
    private String departureTime;
    private String arrivingTime;
    private double converterPrice;
    private String frequency;
    //private String company;

}
