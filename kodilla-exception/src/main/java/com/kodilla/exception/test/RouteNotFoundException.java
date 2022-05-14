package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    RouteNotFoundException(final Flight flight) {
        super("Route from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport()+ " doesn't exist on the map.");
    }
}
