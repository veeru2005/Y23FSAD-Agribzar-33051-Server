package com.agribzar.offerservice.controller; 
import com.agribzar.offerservice.model.Offer; 
import com.agribzar.offerservice.service.OfferService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
 
import java.util.List; 
//collections are important in spring port 
import java.util.Optional; 
 
@RestController 
@RequestMapping("/api/offers") 
public class OfferController { 
 
    @Autowired 
    private OfferService offerService; 
 
    @GetMapping 
    public List<Offer> getAllOffer() { 
        return offerService.getAllOffers(); 
    } 
 
    @GetMapping("/{id}") 
    public Optional<Offer> getOfferById(@PathVariable Long id) { 
        return offerService.getOfferById(id); 
    } 
 
    @PostMapping 
    public Offer addOffer(@RequestBody Offer offer) { 
        return offerService.addOffer(offer); 
    } 
 
    @PutMapping("/{id}") 
    public Offer updateOffer(@PathVariable Long id, @RequestBody Offer 
offer) { 
        offer.setOfferId(id); 
        return offerService.updateOffer(offer); 
    } 
 
    @DeleteMapping("/{id}") 
    public void deleteOffer(@PathVariable Long id) { 
        offerService.deleteOffer(id); 
    } 
} 