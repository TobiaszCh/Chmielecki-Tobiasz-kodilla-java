package com.kodilla.exception.test;

public class SearchFlight {

    public static void main(String[] args) {

        SearchForFlights searchForFlights = new SearchForFlights();

        Flight flight1 = new Flight("Dubaj", "Rzym");
        Flight flight2 = new Flight("Kraków", "Warszawa");
        Flight flight3 = new Flight("Warszawa", "Czestochowa");
        Flight flight4 = new Flight("Tokio", "Kijow");
        Flight flight5 = new Flight("Warszawa", "Dubaj");


        /*try {
            searchForFlights.findFlight(flight1);
            searchForFlights.findFlight(flight2);
            searchForFlights.findFlight(flight3);
            searchForFlights.findFlight(flight4);
            searchForFlights.findFlight(flight5);

        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        try {
            searchForFlights.findFlight(flight1);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            searchForFlights.findFlight(flight2);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            searchForFlights.findFlight(flight3);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            searchForFlights.findFlight(flight4);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            searchForFlights.findFlight(flight5);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
