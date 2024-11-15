package com.simple_api.simple_api2_crud.repository;

import com.simple_api.simple_api2_crud.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository  extends JpaRepository<Goods, String>{
}
