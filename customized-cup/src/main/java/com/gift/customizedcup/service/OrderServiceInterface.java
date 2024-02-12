package com.gift.customizedcup.service;
import java.util.List;
import com.gift.customizedcup.model.Order;

import org.springframework.stereotype.Component;

@Component
public interface OrderServiceInterface {
    public Order addOrder(Order order);
    public List<Order> getAllOrders();
    public Order getOrderById(int id);
    public void deleteOrder(int id);
    public void editOrder(Order order, int id);

}
