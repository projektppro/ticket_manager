package com.ppro.persistence.userRole;

import com.ppro.model.UserRole;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arci on 24.11.2016.
 */
public interface UserRoleRepository extends CrudRepository<UserRole,Integer>{
    Iterable<UserRole> findByUserid(int id);
}
