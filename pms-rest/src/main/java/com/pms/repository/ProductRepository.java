package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.Product;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product>findByManufacturer(String manufacturer);
}
