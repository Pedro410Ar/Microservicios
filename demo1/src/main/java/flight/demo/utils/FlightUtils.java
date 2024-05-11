package flight.demo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import flight.demo.model.Dolar;
import flight.demo.model.Flight;
import flight.demo.model.FlightDTO;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightUtils {

   /* @Value("${dolar.card-url}")
    private String URL_DOLAR_CARD; ¨*/


    @Bean
    public RestTemplate restTemplate(){ return new RestTemplate();
    }

    /*
    public Dolar fetchDolarCard(){
        RestTemplate restTemplate = restTemplate();
        return restTemplate.getForObject(URL_DOLAR_CARD, Dolar.class);
    }
    */

    public Dolar fetchDolar() {
        RestTemplate restTemplate = restTemplate();
        String apiURL = "https://dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiURL, Dolar.class);
        //return restTemplate.getForObject(URL_DOLAR_CARD, Dolar.class);
    }

    public FlightDTO flightMapper(Flight flight, double price ){
        //convierto la lista de vuelos que viene por parametro en flujo
        //la mapeo para que por cada vuelo cree un nuevo flightDTO con otro precio
        return new FlightDTO(
            flight.getId(),
            flight.getOrigin(), 
            flight.getDestiny(), 
            flight.getDepartureTime(),
            flight.getArrivingTime(),
            flight.getPrice()*price, 
            flight.getFrequency(),
            flight.getCompany());
    }

    public List<Flight> detectOffers(List<Flight> flights, double offerPrice) {
        return flights.stream()
                .filter(flight -> flight.getPrice() < offerPrice)
                .collect(Collectors.toList());
    }


}




