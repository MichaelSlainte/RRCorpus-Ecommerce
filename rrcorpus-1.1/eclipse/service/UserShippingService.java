package com.rrcorpus.service;

import com.rrcorpus.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(Long id);
	
	void removeById(Long id);

}
