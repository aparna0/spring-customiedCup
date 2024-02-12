package com.gift.customizedcup.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int orderId;

    String orderName;
    String orderDescription;
    Date orderDate;
    int orderPrice;
    String orderAddress;
    String orderPhone;
    String orderEmail;
    int quantity;

    @ManyToOne()
    //@JsonManagedReference
    @JoinColumn(name="gift_id")
    Gift gift;

    @ManyToOne()
    //@JsonManagedReference
    @JoinColumn(name="user_id")
    User user;

    @ManyToMany(cascade = CascadeType.ALL)
    //@JsonManagedReference
    @JoinTable(
        name = "order_theme",
        joinColumns = @JoinColumn(name="order_id"),
        inverseJoinColumns = @JoinColumn(name="theme_id") 
    )
    List<Theme> theme = new ArrayList<Theme>();

    public Order() {
    }

    public Order(int orderId, String orderName, String orderDescription, Date orderDate, int orderPrice,
            String orderAddress, String orderPhone, String orderEmail, int quantity, Gift giftModel, User userModel,
            List<Theme> themeModel) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderDescription = orderDescription;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderAddress = orderAddress;
        this.orderPhone = orderPhone;
        this.orderEmail = orderEmail;
        this.quantity = quantity;
        this.gift = giftModel;
        this.user = userModel;
        this.theme = themeModel;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Gift getGiftModel() {
        return gift;
    }

    public void setGiftModel(Gift giftModel) {
        this.gift = giftModel;
    }

    public User getUserModel() {
        return user;
    }

    public void setUserModel(User userModel) {
        this.user = userModel;
    }

    public List<Theme> getThemeModel() {
        return theme;
    }

    public void setThemeModel(List<Theme> themeModel) {
        this.theme = themeModel;
    }

    @Override
    public String toString() {
        return "Order [giftModel=" + gift + ", orderAddress=" + orderAddress + ", orderDate=" + orderDate
                + ", orderDescription=" + orderDescription + ", orderEmail=" + orderEmail + ", orderId=" + orderId
                + ", orderName=" + orderName + ", orderPhone=" + orderPhone + ", orderPrice=" + orderPrice
                + ", quantity=" + quantity + ", themeModel=" + theme + ", userModel=" + user + "]";
    }

    
}
