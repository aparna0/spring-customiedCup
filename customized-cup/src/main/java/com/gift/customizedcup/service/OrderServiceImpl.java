package com.gift.customizedcup.service;

import java.util.List;
import java.util.Optional;

import com.gift.customizedcup.model.Order;
import com.gift.customizedcup.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderServiceInterface {

    @Autowired
    OrderRepository orderRepo;
    public Order addOrder(Order order) {
        return (orderRepo.save(order));
    }

    public List<Order> getAllOrders() {
        List<Order> order = orderRepo.findAll();
        return order;
    }

    public Order getOrderById(int id) {
        Optional<Order> order = orderRepo.findById(id);
        return order.get();
    }

    public void deleteOrder(int id) {
        Optional<Order> order = orderRepo.findById(id);
        orderRepo.delete(order.get());
        
    }

    public void editOrder(Order order,int id) {
        //Optional<Order> ord = orderRepo.findById(id);
        //Order currentOrder = ord.get();
        //currentOrder.set
        orderRepo.save(order); 
    }
}
