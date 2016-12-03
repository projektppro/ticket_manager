package com.ppro.persistence.role;

import com.ppro.model.Role;

import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
public interface RoleService {
    List<Role> findAll();

    void saveRole(Role role);

    Role findOne(Integer id);

    void delete(Integer id);
}
