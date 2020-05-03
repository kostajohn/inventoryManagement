package com.PromineoTech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.PromineoTech.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository <Product, Long> {

}
