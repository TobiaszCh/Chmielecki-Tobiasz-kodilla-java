package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final InformationToOrder informationToOrder;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationToOrder informationToOrder, OrderService orderService, OrderRepository orderRepository) {
        this.informationToOrder = informationToOrder;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTo process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getFrom(),
                orderRequest.getTo(), orderRequest.getProduct());

        if (isOrdered) {
            informationToOrder.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getFrom());
            return new OrderDTo(orderRequest.getUser(), true);
        } else {
            return new OrderDTo(orderRequest.getUser(), false);
        }
    }


}
