package com.simple_api.simple_api2_crud.service;
import com.simple_api.simple_api2_crud.model.Goods;

import java.util.List;

public interface GoodsService {
    public String createGoods(Goods goods);
    public String updateGoods(Goods goods);
    public String deleteGoods(String goodsId);
    public Goods getGoods(String goodsId);
    public List<Goods> getAllGoods();
}
