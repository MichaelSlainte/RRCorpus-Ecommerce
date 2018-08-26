package com.rrcorpus.service;

import com.rrcorpus.domain.BillingAddress;
import com.rrcorpus.domain.Order;
import com.rrcorpus.domain.Payment;
import com.rrcorpus.domain.ShippingAddress;
import com.rrcorpus.domain.ShoppingCart;
import com.rrcorpus.domain.User;

public interface OrderService {
	
	Order createOrder(
			ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user
	);

}
