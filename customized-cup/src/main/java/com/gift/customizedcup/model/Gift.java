package com.gift.customizedcup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="gift")
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int giftId;
    String giftName;
    String giftImageUrl;
    String giftDetails;
    String giftPrice;
    String quantity;

    @OneToMany(mappedBy = "gift")
    @JsonBackReference
    List<Order> order = new ArrayList<Order>();
    public Gift() {
    }
    public Gift(int giftId, String giftName, String giftImageUrl, String giftDetails, String giftPrice, String quantity,
            List<Order> order) {
        this.giftId = giftId;
        this.giftName = giftName;
        this.giftImageUrl = giftImageUrl;
        this.giftDetails = giftDetails;
        this.giftPrice = giftPrice;
        this.quantity = quantity;
        this.order = order;
    }
    public int getGiftId() {
        return giftId;
    }
    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }
    public String getGiftName() {
        return giftName;
    }
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
    public String getGiftImageUrl() {
        return giftImageUrl;
    }
    public void setGiftImageUrl(String giftImageUrl) {
        this.giftImageUrl = giftImageUrl;
    }
    public String getGiftDetails() {
        return giftDetails;
    }
    public void setGiftDetails(String giftDetails) {
        this.giftDetails = giftDetails;
    }
    public String getGiftPrice() {
        return giftPrice;
    }
    public void setGiftPrice(String giftPrice) {
        this.giftPrice = giftPrice;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public List<Order> getOrder() {
        return order;
    }
    public void setOrder(List<Order> order) {
        this.order = order;
    }
    @Override
    public String toString() {
        return "Gift [giftDetails=" + giftDetails + ", giftId=" + giftId + ", giftImageUrl=" + giftImageUrl
                + ", giftName=" + giftName + ", giftPrice=" + giftPrice + ", order=" + order + ", quantity=" + quantity
                + "]";
    }
    
    
    
}
