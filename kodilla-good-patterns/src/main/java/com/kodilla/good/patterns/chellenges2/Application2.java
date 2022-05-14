package com.kodilla.good.patterns.chellenges2;

public class Application2 {
    public static void main(String[] args) {
        FlightList flightList = new FlightList();

        FlightSearch flightSearch = new FlightSearch(flightList);
        System.out.println(flightSearch.searchFlightToThisCity("Kraków"));
        System.out.println(flightSearch.searchFlightFromThisCity("Barcelona"));
        System.out.println(flightSearch.searchFlightByThisCity("Warszawa", "Praga"));
        System.out.println(flightSearch.searchFlightByThisCity("Dubaj", "Waszyngton"));

    }
}
