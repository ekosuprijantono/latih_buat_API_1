package com.simple_api.simple_api2_crud.service;
import com.simple_api.simple_api2_crud.model.PurchDetail;

import java.util.List;

public interface PurchDetailService {
    public String createPurchDetail(PurchDetail purchDetail);
    public String updatePurchDetail(PurchDetail purchDetail);
    public String deletePurchDetail(String purchDetailId);
    public PurchDetail getPurchDetail(String purchDetailId);
    public List<PurchDetail> getAllPurchDetail();
}
