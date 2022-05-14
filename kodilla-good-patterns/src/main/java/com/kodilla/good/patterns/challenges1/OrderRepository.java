package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder (Customer customer, LocalDateTime from);
}
