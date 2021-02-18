package com.shopvintage.auctions.domain.services.impl;

import com.shopvintage.auctions.domain.dto.AuctionDto;
import com.shopvintage.auctions.domain.services.AuctionService;
import com.shopvintage.auctions.persistence.entities.Auction;
import com.shopvintage.auctions.persistence.repositories.AuctionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private AuctionsRepository auctionsRepository;

    @Override
    public Flux<AuctionDto> findAll() {
        return this.auctionsRepository
                .findAll()
                .map(p -> convertToDto(p));
    }

    @Override
    public Mono<AuctionDto> save(AuctionDto auctionDto) {
        Auction entity = convertToEntity(auctionDto);

        return this.auctionsRepository.save(entity)
                .map(p -> convertToDto(p));
    }

    @Override
    public Mono<Void> delete(String id) {
        return this.auctionsRepository.deleteById(id);
    }

    @Override
    public Mono<AuctionDto> findById(String id) {
        return this.auctionsRepository.findById(id)
                .map(p -> convertToDto(p));
    }

    private AuctionDto convertToDto(Auction p) {
        return new AuctionDto(p.getId(), p.getProduct(), p.getDescription()
                , p.getAmount(), p.getStatus(), p.getExpireDate(), p.getBids(), p.getLast()
                , p.getCreateDate(), p.getUpdateDate());
    }

    private Auction convertToEntity(AuctionDto p) {
        return new Auction(p.getId(), p.getProduct(), p.getDescription()
                , p.getAmount(), p.getStatus(), p.getExpireDate());
    }
}
