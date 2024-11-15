package com.simple_api.simple_api2_crud.repository;

import com.simple_api.simple_api2_crud.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, String> {
}
