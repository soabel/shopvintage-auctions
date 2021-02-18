package com.shopvintage.auctions.domain.services;

import com.shopvintage.auctions.domain.dto.AuctionDto;
import com.shopvintage.auctions.persistence.entities.Auction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AuctionService {
    Flux<AuctionDto> findAll();
    Mono<AuctionDto> save(AuctionDto client);
    Mono<Void> delete(String id);
    Mono<AuctionDto> findById(String id);
}
