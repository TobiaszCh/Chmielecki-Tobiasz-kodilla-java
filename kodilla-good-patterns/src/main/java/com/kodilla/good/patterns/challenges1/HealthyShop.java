package com.kodilla.good.patterns.challenges1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HealthyShop implements ProductionProcess {

    private boolean existProduct = false;

    @Override
    public boolean process(OrderRequest orderRequest) {
        Map<String, Integer> productHealthyShop = new HashMap<>();
        productHealthyShop.put("Cukier trzcinowy", 50);
        productHealthyShop.put("Sok pomarańczowy", 150);
        productHealthyShop.put("Jogurt naturalny", 250);
        for (Map.Entry<String, Integer> entry :productHealthyShop.entrySet()) {
            if (Objects.equals(entry.getKey(), orderRequest.getProduct().getName()) && entry.getValue() >= orderRequest.getProduct().getQuantity()) {
                existProduct = true;
                break;
            }
        }
        return existProduct;
    }

}
