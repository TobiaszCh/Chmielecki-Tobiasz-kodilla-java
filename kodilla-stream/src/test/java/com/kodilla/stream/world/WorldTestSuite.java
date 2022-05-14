package com.kodilla.stream.world;
import com.kodilla.stream.world.Continent;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void WorldTestSuite() {


        //Give
        Country country1 = new Country("Polska", new BigDecimal("48000000"));
        Country country2 = new Country("Niemcy", new BigDecimal("88000000"));
        Country country3 = new Country("Chiny", new BigDecimal("1200000000"));
        Country country4 = new Country("Indie", new BigDecimal("1400000000"));
        Country country5 = new Country("Egipt", new BigDecimal("28000000"));
        Country country6 = new Country("Nigeria", new BigDecimal("28000000"));

        Continent continent1 = new Continent("Europa");
        Continent continent2 = new Continent("Azja");
        Continent continent3 = new Continent("Afryka");

        World world = new World();
        continent1.getListCountries(country1);
        continent1.getListCountries(country2);
        continent2.getListCountries(country3);
        continent2.getListCountries(country4);
        continent3.getListCountries(country5);
        continent3.getListCountries(country6);

        world.getListContinents(continent1);
        world.getListContinents(continent2);
        world.getListContinents(continent3);
        System.out.println(world);
        //When
        BigDecimal result = world.totalPeople();
        BigDecimal bigDecimal = new BigDecimal("2792000000");
        //Then
        assertEquals(result,bigDecimal);

    }
}





