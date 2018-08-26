package com.rrcorpus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrcorpus.domain.UserPayment;
import com.rrcorpus.repository.UserPaymentRepository;
import com.rrcorpus.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {
	@Autowired
	private UserPaymentRepository userPaymentRepository;
	
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userPaymentRepository.delete(id);
	}
	
}
