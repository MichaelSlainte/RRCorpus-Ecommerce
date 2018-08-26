package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
