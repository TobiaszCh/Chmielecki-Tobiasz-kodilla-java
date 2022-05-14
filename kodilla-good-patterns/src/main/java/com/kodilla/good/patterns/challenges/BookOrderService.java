package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderService {

    public boolean rent(final User user, final LocalDateTime bookOrderFrom, final LocalDateTime bookDeliverTo, final Product product) {
        System.out.println("Ordering " + product.getProduct() + "for: " + user.getName() + user.getSecondName()
                + " from: " + bookOrderFrom.toString() + " to: " + bookDeliverTo.toString() + "for: " + product.getPrice() + ".");

        return true;
    }
}
