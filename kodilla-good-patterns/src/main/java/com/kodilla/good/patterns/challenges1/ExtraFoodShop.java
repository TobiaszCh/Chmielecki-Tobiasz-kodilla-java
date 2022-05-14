package com.kodilla.good.patterns.challenges1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExtraFoodShop implements ProductionProcess {

    boolean existProduct = false;

    @Override
    public boolean process(OrderRequest orderRequest) {
        Map<String, Double> productExtraFood = new HashMap<>();
        productExtraFood.put("Grześki", 500.0);
        productExtraFood.put("Chipsy", 150.0);
        productExtraFood.put("Wino", 50.0);
        for (Map.Entry<String, Double> entry : productExtraFood.entrySet()) {
            if (Objects.equals(entry.getKey(), orderRequest.getProduct().getName()) && entry.getValue() >= orderRequest.getProduct().getQuantity()) {
                existProduct = true;
                break;
            }
        }
        return existProduct;
    }
}
