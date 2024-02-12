package com.gift.customizedcup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int themeId;
    String themeName;
    String themeDetails;
    String themePrice;
    
    @JsonBackReference
    @ManyToMany(mappedBy="theme")
    List<Order> order = new ArrayList<Order>();
    public Theme() {
    }
    public Theme(int themeId, String themeName, String themeDetails, String themePrice, List<Order> order) {
        this.themeId = themeId;
        this.themeName = themeName;
        this.themeDetails = themeDetails;
        this.themePrice = themePrice;
        this.order = order;
    }
    public int getThemeId() {
        return themeId;
    }
    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }
    public String getThemeName() {
        return themeName;
    }
    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }
    public String getThemeDetails() {
        return themeDetails;
    }
    public void setThemeDetails(String themeDetails) {
        this.themeDetails = themeDetails;
    }
    public String getThemePrice() {
        return themePrice;
    }
    public void setThemePrice(String themePrice) {
        this.themePrice = themePrice;
    }
    public List<Order> getOrder() {
        return order;
    }
    public void setOrder(List<Order> order) {
        this.order = order;
    }
    @Override
    public String toString() {
        return "Theme [order=" + order + ", themeDetails=" + themeDetails + ", themeId=" + themeId + ", themeName="
                + themeName + ", themePrice=" + themePrice + "]";
    }
    
}
