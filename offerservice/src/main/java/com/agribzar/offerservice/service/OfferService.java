package com.agribzar.offerservice.service;
import com.agribzar.offerservice.model.Offer;
import com.agribzar.offerservice.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public Optional<Offer> getOfferById(Long offerId) {
        return offerRepository.findById(offerId);
    }

    public Offer addOffer(Offer offer) {
        return offerRepository.save((offer));
    }

    public Offer updateOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public void deleteOffer(Long offerId) {
        offerRepository.deleteById(offerId);
    }
}