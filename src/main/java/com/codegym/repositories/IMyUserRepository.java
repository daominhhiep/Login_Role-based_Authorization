package com.codegym.repositories;

import com.codegym.models.MyUser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("myUserRepository")
public interface IMyUserRepository extends CrudRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}
