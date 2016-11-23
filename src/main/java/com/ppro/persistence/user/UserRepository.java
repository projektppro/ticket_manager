package com.ppro.persistence.user;

import com.ppro.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arci on 21.11.2016.
 */
public interface UserRepository extends CrudRepository<User,Integer> {
    User findByUsername(String userName);
}
