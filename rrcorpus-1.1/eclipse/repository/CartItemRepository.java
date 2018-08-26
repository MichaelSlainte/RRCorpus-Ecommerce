package com.rrcorpus.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.CartItem;
import com.rrcorpus.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
}
