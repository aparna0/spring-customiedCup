package com.gift.customizedcup.controller;

import com.gift.customizedcup.model.Order;
import com.gift.customizedcup.service.OrderServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class OrderController {
    
    @Autowired
    OrderServiceImpl orderServ;

    @PostMapping("/user/addOrder")
    public Order addOrder(@RequestBody Order order){
        return orderServ.addOrder(order);   
    }
    
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/admin/getAllOrders")
    public List<Order> getAllOrders(){
        return orderServ.getAllOrders();
    } 
    
    @PutMapping("/admin/editOrder/{orderId}")
    public void editOrder(@RequestBody Order order, @PathVariable int orderId){
        order.setOrderId(orderId);
        orderServ.editOrder(order, orderId);
    }
    @DeleteMapping("/admin/deleteOrder/{orderId}")
    public void deleteOrder(@PathVariable int orderId){
        orderServ.deleteOrder(orderId);
    }
    @PutMapping("/user/editOrder/{orderId}")
    public void editOrderByUser(@RequestBody Order order, @PathVariable int orderId){
        order.setOrderId(orderId);
        orderServ.editOrder(order, orderId);
    }
    @DeleteMapping("/user/deleteOrder/{orderId}")
    public void deleteOrderByUser(@PathVariable int orderId){
        orderServ.deleteOrder(orderId);
    }
}
