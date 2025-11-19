package PurchaseOrder.model;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double calculateTotal() {
        double total = 0.0;

        for (Order order : orders) {
            total += order.newPrice(); // polimorfismo funcionando
        }

        return total;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
