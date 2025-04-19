package com.agribzar.offerservice.repository;
import com.agribzar.offerservice.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}