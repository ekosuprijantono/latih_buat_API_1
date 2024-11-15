package com.simple_api.simple_api2_crud.service.impl;

import com.simple_api.simple_api2_crud.exception.APINotFoundException;
import com.simple_api.simple_api2_crud.model.Goods;
import com.simple_api.simple_api2_crud.repository.GoodsRepository;
import com.simple_api.simple_api2_crud.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    GoodsRepository goodsRepository;

    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public String createGoods(Goods goods) {
        String goodsId = goods.getGoodsId();
        if (goodsRepository.findById(goodsId).isPresent())
            throw new APINotFoundException("Goods Id already exists !");
        goodsRepository.save(goods);
        return "Saved To Database !";
    }

    @Override
    public String updateGoods(Goods goods) {
        goodsRepository.save(goods);
        return "Updated To Database !";
    }

    @Override
    public String deleteGoods(String goodsId) {
        goodsRepository.deleteById(goodsId);
        return "Deleted From Database !";
    }

    @Override
    public Goods getGoods(String goodsId) {
        //exception if not found
        if (goodsRepository.findById(goodsId).isEmpty())
            throw new APINotFoundException("Goods Id does not exists !");
        return goodsRepository.findById(goodsId).get();
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsRepository.findAll();
    }
}
