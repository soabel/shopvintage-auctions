package com.shopvintage.auctions.persistence.entities;

import java.util.Date;

public class AuctionBid {
    private Date date;
    private Bidder bidder;
    private Double amount;

    public AuctionBid() {
    }

    public AuctionBid(Date date, Bidder bidder, Double amount) {
        this.date = date;
        this.bidder = bidder;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AuctionBid{" +
                "date=" + date +
                ", bidder=" + bidder +
                ", amount=" + amount +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
