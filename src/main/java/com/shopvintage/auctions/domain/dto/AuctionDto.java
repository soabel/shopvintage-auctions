package com.shopvintage.auctions.domain.dto;

import com.shopvintage.auctions.persistence.entities.AuctionBid;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class AuctionDto {
    private String id;
    private String product;
    private String description;
    private Double amount;
    private String status;
    private Date expireDate;
    private List<AuctionBid> bids;
    private AuctionBid last;
    private Date createDate;
    private Date updateDate;

    public AuctionDto() {
    }

    public AuctionDto(String id, String product, String description, Double amount, String status, Date expireDate, List<AuctionBid> bids, AuctionBid last, Date createDate, Date updateDate) {
        this.id = id;
        this.product = product;
        this.description = description;
        this.amount = amount;
        this.status = status;
        this.expireDate = expireDate;
        this.bids = bids;
        this.last = last;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public List<AuctionBid> getBids() {
        return bids;
    }

    public void setBids(List<AuctionBid> bids) {
        this.bids = bids;
    }

    public AuctionBid getLast() {
        return last;
    }

    public void setLast(AuctionBid last) {
        this.last = last;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "AuctionDto{" +
                "id='" + id + '\'' +
                ", product='" + product + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", expireDate=" + expireDate +
                ", bids=" + bids +
                ", last=" + last +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
