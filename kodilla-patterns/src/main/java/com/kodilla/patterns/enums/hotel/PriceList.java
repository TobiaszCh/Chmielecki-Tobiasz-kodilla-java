package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class PriceList {

    private static final Map<Season, BigDecimal> singleBedPrices = Map.of(
            Season.LOW, new BigDecimal(300),
            Season.HIGH, new BigDecimal(320),
            Season.HOLIDAY, new BigDecimal(450)
    );

    private static final Map<Season, BigDecimal> doubleBedPrices = Map.of(
            Season.LOW, new BigDecimal(350),
            Season.HIGH, new BigDecimal(400),
            Season.HOLIDAY, new BigDecimal(500)
    );

    static BigDecimal getSingleBedPrice(Season season) {
        return singleBedPrices.get(season);
    }

    static BigDecimal getDoubleBedPrice(Season season) {
        return doubleBedPrices.get(season);
    }
}
