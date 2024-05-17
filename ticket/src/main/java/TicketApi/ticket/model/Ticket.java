package TicketApi.ticket.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Ticket {
    private Long id;
    private FlightDTO flightDTO;
    private String passengerName;
    private String passengerEmail;
    private String passengerPassport;

}
