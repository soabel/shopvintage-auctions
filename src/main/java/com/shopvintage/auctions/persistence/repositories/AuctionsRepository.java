package com.shopvintage.auctions.persistence.repositories;

import com.shopvintage.auctions.domain.dto.AuctionDto;
import com.shopvintage.auctions.persistence.entities.Auction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AuctionsRepository extends ReactiveMongoRepository<Auction, String> {
}
