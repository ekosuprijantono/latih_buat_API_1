package com.simple_api.simple_api2_crud.service.impl;

import com.simple_api.simple_api2_crud.exception.APINotFoundException;
import com.simple_api.simple_api2_crud.model.Vendor;
import com.simple_api.simple_api2_crud.repository.VendorRepository;
import com.simple_api.simple_api2_crud.service.VendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createVendor(Vendor vendor) {
        String vendorId = vendor.getVendorId();
        if (vendorRepository.findById(vendorId).isPresent())
            throw new APINotFoundException("Vendor Id already exists !");
        vendorRepository.save(vendor);
        return "Saved To Database !";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        vendorRepository.save(vendor);
        return "Updated To Database !";
    }

    @Override
    public String deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
        return "Deleted From Database !";
    }

    @Override
    public Vendor getVendor(String vendorId) {
        if (vendorRepository.findById(vendorId).isEmpty())
            throw new APINotFoundException("Vendor Id does not exists !");
        return vendorRepository.findById(vendorId).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
