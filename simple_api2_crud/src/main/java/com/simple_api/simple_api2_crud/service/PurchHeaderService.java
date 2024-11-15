package com.simple_api.simple_api2_crud.service;
import com.simple_api.simple_api2_crud.model.PurchHeader;

import java.util.List;

public interface PurchHeaderService {
    public String createPurchHeader(PurchHeader purchHeader);
    public String updatePurchHeader(PurchHeader purchHeader);
    public String deletePurchHeader(String purchHeaderId);
    public PurchHeader getPurchHeader(String purchHeaderId);
    public List<PurchHeader> getAllPurchHeader();
}
