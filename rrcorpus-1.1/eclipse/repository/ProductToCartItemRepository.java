package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.ProductToCartItem;
import com.rrcorpus.domain.CartItem;

public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
}
