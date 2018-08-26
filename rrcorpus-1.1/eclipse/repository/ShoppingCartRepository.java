package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
