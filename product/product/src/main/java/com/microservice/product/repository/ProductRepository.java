package com.microservice.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.product.model.ProductModel;


public interface  ProductRepository extends  MongoRepository<ProductModel, String> {
    
}
