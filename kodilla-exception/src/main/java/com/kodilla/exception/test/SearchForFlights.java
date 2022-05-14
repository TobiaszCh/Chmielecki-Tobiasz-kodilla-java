package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchForFlights {

    public  void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean>  lots = new HashMap<>();
        lots.put("Warszawa", true);
        lots.put("Kraków", false);
        lots.put("Dubaj", true);
        lots.put("Rzym", false);
        lots.put("Paryż", true);

        if (lots.containsKey(flight.getDepartureAirport()) && lots.containsKey(flight.getArrivalAirport())) {
             if (lots.get(flight.getArrivalAirport())) {
                System.out.println("Route from " + flight.getDepartureAirport() + " to " +
                        flight.getArrivalAirport() + " exists.");
            }
             else {
                 System.out.println("The airport " + flight.getArrivalAirport() + " isn't available at the moment for planes arrival.");
             }
        }
        else {
            throw new RouteNotFoundException(flight);
        }
    }
}
