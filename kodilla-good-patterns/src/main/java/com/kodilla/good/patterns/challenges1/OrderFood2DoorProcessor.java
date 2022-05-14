package com.kodilla.good.patterns.challenges1;

public class OrderFood2DoorProcessor implements Food2DoorProcess {

    private final InformationToOrder informationToOrder;
    private final OrderService orderService;
    private final OrderRepository orderRepository;
    private final ProductionProcess productionProcessExtraFood = new ExtraFoodShop();
    private final ProductionProcess productionProcessFreeShop = new HealthyShop();
    private final ProductionProcess productionProcessGlutenFree = new GlutenFreeShop();

    public OrderFood2DoorProcessor(InformationToOrder informationToOrder, OrderService orderService, OrderRepository orderRepository) {
        this.informationToOrder = informationToOrder;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void existProcess(OrderRequest orderRequest) {
       if (productionProcessExtraFood.process(orderRequest) || productionProcessFreeShop.process(orderRequest) || productionProcessGlutenFree.process(orderRequest)) {
            orderService.order(orderRequest.getUser(), orderRequest.getTo(),
                 orderRequest.getProduct());
            informationToOrder.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getTo());
        } else {
          System.out.println("Order don't exist.");
        }
    }
}
