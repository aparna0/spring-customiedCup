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
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userId;
    String email;
    String password;
    String userName;
    String userRole;
    
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    List<Order> order = new ArrayList<Order>();

    public User() {
    }

    public User(int userId, String email, String password, String userName, String userRole, List<Order> order) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.userRole = userRole;
        this.order = order;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", order=" + order + ", password=" + password + ", userId=" + userId
                + ", userName=" + userName + ", userRole=" + userRole + "]";
    }
    
}
