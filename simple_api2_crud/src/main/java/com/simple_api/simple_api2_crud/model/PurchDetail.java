package com.simple_api.simple_api2_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_java_purchd_eko")
public class PurchDetail {
    @Id
    private String purchdtlId;
    private String purchhdrId;
    private String pdgoodsId;
    private Integer purchQty;
    private Integer goodsPrice;

    public PurchDetail() {
    }

    //constructor
    public PurchDetail(String purchdtlId, String purchhdrId, String pdgoodsId, Integer purchQty, Integer goodsPrice) {
        this.purchdtlId = purchdtlId;
        this.purchhdrId = purchhdrId;
        this.pdgoodsId = pdgoodsId;
        this.purchQty = purchQty;
        this.goodsPrice = goodsPrice;
    }

    //getter
    public String getPurchdtlId() {
        return purchdtlId;
    }

    public String getPurchhdrId() {
        return purchhdrId;
    }

    public String getPdgoodsId() {
        return pdgoodsId;
    }

    public Integer getPurchQty() {
        return purchQty;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    //setter
    public void setPurchdtlId(String purchdtlId) {
        this.purchdtlId = purchdtlId;
    }

    public void setPurchhdrId(String purchhdrId) {
        this.purchhdrId = purchhdrId;
    }

    public void setPdgoodsId(String pdgoodsId) {
        this.pdgoodsId = pdgoodsId;
    }

    public void setPurchQty(Integer purchQty) {
        this.purchQty = purchQty;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

}
