package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public interface OrderService {

    void order(Customer customer, LocalDateTime from, Product product);
}
