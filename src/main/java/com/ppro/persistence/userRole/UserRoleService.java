package com.ppro.persistence.userRole;

import com.ppro.model.User;
import com.ppro.model.UserRole;

import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
public interface UserRoleService {
    List<Integer> findByUserId(int userId);

    List<UserRole> findAll();

    void saveUserRole(UserRole user);

    UserRole findOne(Integer id);

    void delete(Integer id);
}
