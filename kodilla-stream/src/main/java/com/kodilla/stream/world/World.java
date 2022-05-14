package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {


    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public void getListContinents(Continent continent) {
        continents.add(continent);


    }
    public BigDecimal totalPeople() {
        BigDecimal totalPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }

    @Override
    public String toString() {
        return "World: " + continents ;
    }
}
