package com.codegym.repositories;

import com.codegym.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepository extends CrudRepository<Role, Long> {
}
