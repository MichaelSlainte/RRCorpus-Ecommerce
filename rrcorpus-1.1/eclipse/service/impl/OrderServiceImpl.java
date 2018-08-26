package com.rrcorpus.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrcorpus.domain.BillingAddress;
import com.rrcorpus.domain.Product;
import com.rrcorpus.domain.CartItem;
import com.rrcorpus.domain.Order;
import com.rrcorpus.domain.Payment;
import com.rrcorpus.domain.ShippingAddress;
import com.rrcorpus.domain.ShoppingCart;
import com.rrcorpus.domain.User;
import com.rrcorpus.repository.BillingAddressRepository;
import com.rrcorpus.repository.OrderRepository;
import com.rrcorpus.repository.PaymentRepository;
import com.rrcorpus.repository.ShippingAddressRepository;
import com.rrcorpus.service.ProductService;
import com.rrcorpus.service.CartItemService;
import com.rrcorpus.service.OrderService;
import com.rrcorpus.utility.MailConstructor;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private BillingAddressRepository billingAddressRepository;
	
	@Autowired
	private ShippingAddressRepository shippingAddressRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private MailConstructor mailConstructor;
	
	public synchronized  Order createOrder(
			ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user
			){
		Order order = new Order();
		order.setBillingAddress(billingAddress);
		order.setOrderStatus("created");
		order.setPayment(payment);
		order.setShippingAddress(shippingAddress);
		order.setShippingMethod(shippingMethod);
		
		List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
		
		for (CartItem cartItem : cartItemList) {
			Product product = cartItem.getProduct();
			cartItem.setOrder(order);
			product.setInStockNumber(product.getInStockNumber()-cartItem.getQty());
		}
		
		order.setCartItemList(cartItemList);
		order.setOrderDate(Calendar.getInstance().getTime());
		order.setOrderTotal(shoppingCart.getGrandTotal());
		shippingAddress.setOrder(order);
		billingAddress.setOrder(order);
		payment.setOrder(order);
		order.setUser(user);
		order = orderRepository.save(order);
		
		return order;
	}
	
	public Order findOne(Long id) {
		return orderRepository.findOne(id);
	}

}
