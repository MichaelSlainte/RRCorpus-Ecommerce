package com.rrcorpus.service;

import com.rrcorpus.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
