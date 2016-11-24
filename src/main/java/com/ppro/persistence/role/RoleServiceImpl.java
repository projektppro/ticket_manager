package com.ppro.persistence.role;

import com.ppro.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
public class RoleServiceImpl implements RoleService {


    @Qualifier("roleRepository")
    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return (List<Role>) repository.findAll();
    }

    @Override
    public void saveRole(Role role) {
        repository.save(role);
    }

    @Override
    public Role findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
