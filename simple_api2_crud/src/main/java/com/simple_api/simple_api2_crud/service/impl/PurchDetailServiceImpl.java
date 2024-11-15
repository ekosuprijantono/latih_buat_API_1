package com.simple_api.simple_api2_crud.service.impl;

import com.simple_api.simple_api2_crud.exception.APINotFoundException;
import com.simple_api.simple_api2_crud.model.PurchDetail;
import com.simple_api.simple_api2_crud.repository.PurchDetailRepository;
import com.simple_api.simple_api2_crud.repository.GoodsRepository;
import com.simple_api.simple_api2_crud.service.PurchDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchDetailServiceImpl implements PurchDetailService{
    PurchDetailRepository purchDetailRepository;
    GoodsRepository goodsRepository;

    //constructor
    public PurchDetailServiceImpl(PurchDetailRepository purchDetailRepository,GoodsRepository goodsRepository) {
        this.purchDetailRepository = purchDetailRepository;
        this.goodsRepository = goodsRepository;
    }

    @Override
    public String createPurchDetail(PurchDetail purchDetail) {
        String pdgoodsId = purchDetail.getPdgoodsId();
        //check vendor integory data
        if (goodsRepository.findById(pdgoodsId).isEmpty())
            throw new APINotFoundException("Goods Id Not exists !");
        purchDetailRepository.save(purchDetail);
        return "Saved To Database !";
    }

    @Override
    public String updatePurchDetail(PurchDetail purchDetail) {
        purchDetailRepository.save(purchDetail);
        return "Updated To Database !";
    }

    @Override
    public String deletePurchDetail(String purchDetailId) {
        purchDetailRepository.deleteById(purchDetailId);
        return "Deleted From Database !";
    }

    @Override
    public PurchDetail getPurchDetail(String purchDetailId) {
        return purchDetailRepository.findById(purchDetailId).get();
    }

    @Override
    public List<PurchDetail> getAllPurchDetail() {
        return purchDetailRepository.findAll();
    }

}
