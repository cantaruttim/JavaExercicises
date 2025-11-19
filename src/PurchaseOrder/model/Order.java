package PurchaseOrder.model;

import PurchaseOrder.enums.OrderType;

public abstract class Order {

    private Long id;
    private Double price;
    private OrderType type;

    public Order(Long id, Double price, OrderType type) {
        this.id = id;
        this.price = price;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public OrderType getType() {
        return type;
    }

    public abstract double taxCalculator();

    public double newPrice() {
        return price + price * taxCalculator();
    }
}
