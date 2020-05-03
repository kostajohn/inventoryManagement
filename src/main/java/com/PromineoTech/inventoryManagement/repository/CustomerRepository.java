package com.PromineoTech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.PromineoTech.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
