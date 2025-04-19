package com.agribzar.userservice.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String description;
    private int availableQuantity;
    private double percentage;
    private LocalDate userValidity;

    public Long getUserId() {
        return userId;
    }

    public User() {
        super();
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public LocalDate getUserValidity() {
        return userValidity;
    }
    public void setUserValidity(LocalDate userValidity) {
        this.userValidity = userValidity;
    }
    
    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + ", description=" + description + ", availableQuantity="
                + availableQuantity + ", percentage=" + percentage + ", userValidity=" + userValidity + "]";
    }
}