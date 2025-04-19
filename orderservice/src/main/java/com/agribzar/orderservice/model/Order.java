package com.agribzar.orderservice.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String name;
    private String description;
    private int availableQuantity;
    private double percentage;
    private LocalDate orderValidity;

    public Long getOrderId() {
        return orderId;
    }

    public Order() {
        super();
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
    public LocalDate getOrderValidity() {
        return orderValidity;
    }
    public void setOrderValidity(LocalDate orderValidity) {
        this.orderValidity = orderValidity;
    }
    
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", name=" + name + ", description=" + description + ", availableQuantity="
                + availableQuantity + ", percentage=" + percentage + ", orderValidity=" + orderValidity + "]";
    }
}
