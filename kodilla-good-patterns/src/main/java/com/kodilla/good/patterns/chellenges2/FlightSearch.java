package com.kodilla.good.patterns.chellenges2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlightSearch {

    private final FlightList flightList;

    public FlightSearch (FlightList flightList) {
        this.flightList = flightList;
    }

    public List<Flight> searchFlightFromThisCity (String departure) {
       return flightList.setFlightList().stream()
                .filter(s -> Objects.equals(s.getDeparture(), departure))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightToThisCity (String arrival) {
       return flightList.setFlightList().stream()
                .filter(s -> Objects.equals(s.getArrival(), arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightByThisCity (String departure, String arrival) {
        List<Flight> result = new ArrayList<>();
        List<Flight> startFlight = searchFlightFromThisCity(departure);
        List<Flight> finalFlight = searchFlightToThisCity(arrival);

        for (Flight startF: startFlight) {
            for (Flight finalF: finalFlight) {
                if (startF.getArrival().equals(finalF.getDeparture())) {
                    result.add(startF);
                    result.add(finalF);
                }
            }
        }

        if(result.isEmpty()) {
            result = flightList.setFlightList().stream()
                    .filter(s -> Objects.equals(s.getDeparture(), departure) && Objects.equals(s.getArrival(), arrival))
                    .collect(Collectors.toList());
        }

        return result;




    }
}
