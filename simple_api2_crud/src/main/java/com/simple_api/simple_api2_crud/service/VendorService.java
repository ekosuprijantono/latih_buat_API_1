package com.simple_api.simple_api2_crud.service;

import com.simple_api.simple_api2_crud.model.Vendor;

import java.util.List;

public interface VendorService {
    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(String vendorId);
    public Vendor getVendor(String vendorId);
    public List<Vendor> getAllVendors();
}
