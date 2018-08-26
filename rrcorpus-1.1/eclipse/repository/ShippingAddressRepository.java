package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {
	
}
