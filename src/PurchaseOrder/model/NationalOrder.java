package PurchaseOrder.model;

import PurchaseOrder.enums.OrderType;

public class NationalOrder extends Order {

    public NationalOrder(Long id, Double price) {
        super(id, price, OrderType.NATIONAL);
    }

    @Override
    public double taxCalculator() {
            return .1;
    }

}
