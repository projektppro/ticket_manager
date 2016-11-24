package com.ppro.persistence.userRole;

import com.ppro.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Qualifier("userRoleRepository")
    @Autowired
    private UserRoleRepository repository;

    @Override
    public List<Integer> findByUserId(int userId) {
        return (List<Integer>) repository.findByUserid(userId);
    }

    @Override
    public List<UserRole> findAll() {
        return (List<UserRole>) repository.findAll();
    }

    @Override
    public void saveUserRole(UserRole userRole) {
        repository.save(userRole);
    }

    @Override
    public UserRole findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
