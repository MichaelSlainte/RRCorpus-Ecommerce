package com.rrcorpus.service;

import java.util.List;

import com.rrcorpus.domain.Product;
import com.rrcorpus.domain.CartItem;
import com.rrcorpus.domain.ShoppingCart;
import com.rrcorpus.domain.User;

public interface CartItemService {
	
	CartItem addProductToCartItem(Product product, User user, int qty);
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
	
	CartItem updateCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem findById(Long id);
	
	CartItem save(CartItem cartItem);

}
