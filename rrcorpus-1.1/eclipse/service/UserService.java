package com.rrcorpus.service;

import java.util.List;
import java.util.Set;

import com.rrcorpus.domain.User;
import com.rrcorpus.domain.UserBilling;
import com.rrcorpus.domain.UserPayment;
import com.rrcorpus.domain.UserShipping;
import com.rrcorpus.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);

	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User save(User user);
	
	User findById(Long id);
	
	void updateUserPaymentInfo(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultShipping(Long userShippingId, User user);
	
}
