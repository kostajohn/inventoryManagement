package com.PromineoTech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.PromineoTech.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository <Order, Long> {

}
