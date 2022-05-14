package com.kodilla.good.patterns.chellenges2;
import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> setFlightList () {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", "Kraków"));
        flightList.add(new Flight("Dubaj", "Waszyngton"));
        flightList.add(new Flight("Waszyngton", "New York"));
        flightList.add(new Flight("Barcelona", "Madryt"));
        flightList.add(new Flight("Kraków", "Praga"));

        return flightList;
    }

}
