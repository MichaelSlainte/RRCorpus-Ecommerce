package com.rrcorpus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.Order;
import com.rrcorpus.domain.User;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByUser(User user);
}
