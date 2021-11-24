package com.connell.SimpleLoginApplication.repository;

import com.connell.SimpleLoginApplication.model.ERole;
import com.connell.SimpleLoginApplication.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
