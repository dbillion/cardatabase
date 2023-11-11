package com.daiyior.cardatabase.domain;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
public interface AppUserRepository extends CrudRepository<AppUser,Long>{
    Optional<AppUser> findByUsername(String username);
}
