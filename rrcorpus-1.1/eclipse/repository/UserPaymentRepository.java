package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
