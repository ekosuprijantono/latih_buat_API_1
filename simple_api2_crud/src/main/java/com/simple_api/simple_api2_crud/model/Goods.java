package com.simple_api.simple_api2_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_java_goods_eko")
public class Goods {
    @Id
    private String goodsId;
    private String goodsName;
    private String goodsCategory;

    public Goods() {
    }

    //constructor
    public Goods(String goodsId, String goodsName, String goodsCategory) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsCategory = goodsCategory;
    }

    //getter
    public String getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    //setter
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }
}