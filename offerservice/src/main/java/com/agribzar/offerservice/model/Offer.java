package com.agribzar.offerservice.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    private String name;
    private String description;
    private int availableQuantity;
    private double percentage;
    private LocalDate offerValidity;
    private String imageUrl; // New field for the image URL

    public Long getOfferId() {
        return offerId;
    }

    public Offer() {
        super();
        // Default constructor
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
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

    public LocalDate getOfferValidity() {
        return offerValidity;
    }

    public void setOfferValidity(LocalDate offerValidity) {
        this.offerValidity = offerValidity;
    }

    public String getImageUrl() { // Getter for imageUrl
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) { // Setter for imageUrl
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Offer [offerId=" + offerId + ", name=" + name + ", description=" + description + ", availableQuantity="
                + availableQuantity + ", percentage=" + percentage + ", offerValidity=" + offerValidity + ", imageUrl=" + imageUrl + "]";
    }
}