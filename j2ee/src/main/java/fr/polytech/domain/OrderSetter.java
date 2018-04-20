package fr.polytech.domain;

import fr.polytech.datasource.Material;
import fr.polytech.datasource.Order;

import java.util.List;

public interface OrderSetter {
    boolean addOrder(Order order);
    Order modifyOrder(Order order, String orderId);
    Order deleteOrder(String id);

    boolean payForOrder(String orderId);
}
