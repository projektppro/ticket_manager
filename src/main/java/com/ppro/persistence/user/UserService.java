package com.ppro.persistence.user;

import com.ppro.model.User;

import java.util.List;

/**
 * Created by Arci on 21.11.2016.
 */
public interface UserService {

    User findByUsername(String userName);
    
    List<User> findAll();

    void saveUser(User user);

    User findOne(Integer id);

    void delete(Integer id);
}
