package com.kodilla.good.patterns.challenges1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GlutenFreeShop implements ProductionProcess {

    private boolean existProduct = false;

    @Override
    public boolean process(OrderRequest orderRequest) {
        Map<String, Integer> productGlutenFree = new HashMap<>();
        productGlutenFree.put("Ryba", 200);
        productGlutenFree.put("Dżem", 100);
        productGlutenFree.put("Jogurt", 50);
        for (Map.Entry<String, Integer> entry : productGlutenFree.entrySet()) {
            if (Objects.equals(entry.getKey(), orderRequest.getProduct().getName()) && entry.getValue() >= orderRequest.getProduct().getQuantity()) {
                existProduct = true;
                break;
            }
        }
        return existProduct;
    }
}
