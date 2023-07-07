package com.m5b.tap.crudproductomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m5b.tap.crudproductomongo.model.ProductoDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO, String> {
	
	
}