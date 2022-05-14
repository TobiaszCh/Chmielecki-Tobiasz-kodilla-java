package com.kodilla.good.patterns.challenges1;
import java.util.Objects;

public class Product {

    private final String name;
    private final double quantity;

    public Product(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(product1.quantity, quantity) == 0 && Objects.equals(name, product1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}