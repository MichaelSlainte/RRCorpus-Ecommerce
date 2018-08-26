package com.rrcorpus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByNameContaining(String name);
}
