package com.simple_api.simple_api2_crud.service.impl;

import com.simple_api.simple_api2_crud.exception.APINotFoundException;
import com.simple_api.simple_api2_crud.model.PurchHeader;
import com.simple_api.simple_api2_crud.repository.PurchHeaderRepository;
import com.simple_api.simple_api2_crud.repository.VendorRepository;
import com.simple_api.simple_api2_crud.service.PurchHeaderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchHeaderServiceImpl implements PurchHeaderService{
    PurchHeaderRepository purchHeaderRepository;
    VendorRepository vendorRepository;

    //constructor
    public PurchHeaderServiceImpl(PurchHeaderRepository purchHeaderRepository,VendorRepository vendorRepository) {
        this.purchHeaderRepository = purchHeaderRepository;
            this.vendorRepository = vendorRepository;
    }

    @Override
    public String createPurchHeader(PurchHeader purchHeader) {
        String purchId = purchHeader.getPurchId();
        String phvendorId = purchHeader.getPhvendorId();
        //cek if already exists
        if (purchHeaderRepository.findById(purchId).isPresent())
            throw new APINotFoundException("Purchase Id already exists !");
        //check vendor integory data
        if (vendorRepository.findById(phvendorId).isEmpty())
            throw new APINotFoundException("Vendor Id Not exists !");
        purchHeaderRepository.save(purchHeader);
        return "Saved To Database !";
    }

    @Override
    public String updatePurchHeader(PurchHeader purchHeader) {
        purchHeaderRepository.save(purchHeader);
        return "Updated To Database !";
    }

    @Override
    public String deletePurchHeader(String purchHeaderId) {
        purchHeaderRepository.deleteById(purchHeaderId);
        return "Deleted From Database !";
    }

    @Override
    public PurchHeader getPurchHeader(String purchHeaderId) {
        if (purchHeaderRepository.findById(purchHeaderId).isEmpty())
            throw new APINotFoundException("Purchase Id does not exists !");
        return purchHeaderRepository.findById(purchHeaderId).get();
    }

    @Override
    public List<PurchHeader> getAllPurchHeader() {
        return purchHeaderRepository.findAll();
    }


}
