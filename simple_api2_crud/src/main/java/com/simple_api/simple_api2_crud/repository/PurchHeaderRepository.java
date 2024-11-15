package com.simple_api.simple_api2_crud.repository;

import com.simple_api.simple_api2_crud.model.PurchHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchHeaderRepository  extends JpaRepository<PurchHeader, String> {
}
