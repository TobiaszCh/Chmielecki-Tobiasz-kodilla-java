package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameContinent;
    private final List<Country> countries = new ArrayList<>();


    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void getListCountries(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }


    public String getNameContinent() {
        return nameContinent;
    }

    @Override
    public String toString() {
        return "Continent: " + nameContinent +" "
        + countries;
    }

}
