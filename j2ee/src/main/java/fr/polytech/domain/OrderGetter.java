package fr.polytech.domain;

import fr.polytech.datasource.Order;

import java.util.List;

public interface OrderGetter {
    List<Order> getAllOrders();
    List<Order> getAllUnpaidOrders();
    List<Order> getAllPaidOrders();
    Order getOrder(String orderId);
}
