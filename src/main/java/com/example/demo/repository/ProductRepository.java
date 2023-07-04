package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.demo.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Long>, 
PagingAndSortingRepository<Product, Long>, 
JpaSpecificationExecutor<Product>, 
JpaRepository<Product, Long>{

}
