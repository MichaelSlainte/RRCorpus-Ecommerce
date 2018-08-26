package com.rrcorpus.repository;

import org.springframework.data.repository.CrudRepository;

import com.rrcorpus.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
