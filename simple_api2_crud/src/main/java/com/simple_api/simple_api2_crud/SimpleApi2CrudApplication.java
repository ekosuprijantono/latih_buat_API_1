package com.simple_api.simple_api2_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.simple_api.simple_api2_crud.model.Vendor","com.simple_api.simple_api2_crud.model.Goods"})
public class SimpleApi2CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApi2CrudApplication.class, args);
	}

}
