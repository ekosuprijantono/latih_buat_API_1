package com.simple_api.simple_api2_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_java_vendor_eko")
public class Vendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;

    public Vendor() {
    }

    //constructor
    public Vendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
    }

    //getter
    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    //setter
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }



}

