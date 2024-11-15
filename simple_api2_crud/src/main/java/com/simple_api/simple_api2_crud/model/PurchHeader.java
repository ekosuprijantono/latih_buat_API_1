package com.simple_api.simple_api2_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="test_java_purchh_eko")
public class PurchHeader {
    @Id
    private String purchId;
    private Date purchDate;
    private String phvendorId;
    private String purchDesc;

    public PurchHeader() {
    }

    //constructor
    public PurchHeader(String purchId, Date purchDate, String phvendorId, String purchDesc) {
        this.purchId = purchId;
        this.purchDate = purchDate;
        this.phvendorId = phvendorId;
        this.purchDesc = purchDesc;
    }

    //getter
    public String getPurchId() {
        return purchId;
    }

    public Date getPuchDate() {
        return purchDate;
    }

    public String getPhvendorId() {
        return phvendorId;
    }

    public String getPurchDesc() {
        return purchDesc;
    }

    //setter
    public void setPurchId(String purchId) {
        this.purchId = purchId;
    }

    public void setPuchDate(Date purchDate) {
        this.purchDate = purchDate;
    }

    public void setVendorId(String phvendorId) {
        this.phvendorId = phvendorId;
    }

    public void setPurchDesc(String purchDesc) {
        this.purchDesc = purchDesc;
    }

}
