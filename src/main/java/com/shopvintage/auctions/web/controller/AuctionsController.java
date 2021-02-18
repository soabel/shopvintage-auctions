package com.shopvintage.auctions.web.controller;

import com.shopvintage.auctions.domain.dto.AuctionDto;
import com.shopvintage.auctions.domain.services.AuctionService;
import com.shopvintage.auctions.persistence.entities.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("auctions")
public class AuctionsController {

    @Autowired
    private AuctionService auctionService;

    @GetMapping
    public Flux<AuctionDto> findAll(){
        return this.auctionService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<AuctionDto> findById(@PathVariable("id") String id){
        return this.auctionService.findById(id);
    }

    @PostMapping
    public Mono<AuctionDto> save(@RequestBody AuctionDto auction){
        return this.auctionService.save(auction);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return this.auctionService.delete(id);
    }

}
