package com.simple_api.simple_api2_crud.repository;

import com.simple_api.simple_api2_crud.model.PurchDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchDetailRepository extends JpaRepository<PurchDetail, String> {
}
