package PurchaseOrder.model;

import PurchaseOrder.enums.OrderType;

public class InternationalOrder extends Order {

    public InternationalOrder(Long id, Double price) {
        super(id, price, OrderType.INTERNATIONAL);
    }

    @Override
    public double taxCalculator() {
            return .25;
    }


}
