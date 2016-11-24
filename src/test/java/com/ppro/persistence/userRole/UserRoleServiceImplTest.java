package com.ppro.persistence.userRole;

import com.ppro.TestSuperClass;
import com.ppro.model.UserRole;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Arci on 24.11.2016.
 */
public class UserRoleServiceImplTest extends TestSuperClass {


    @Autowired
    private UserRoleServiceImpl service;

    @Test
    public void saveUserRole() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1);
        userRole.setUserid(1);
        userRole.setRoleid(1);
        service.saveUserRole(userRole);
        assertTrue(service.findAll().size()==1);
    }

}