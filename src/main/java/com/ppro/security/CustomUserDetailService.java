package com.ppro.security;

import com.ppro.model.User;
import com.ppro.model.UserRole;
import com.ppro.persistence.role.RoleService;
import com.ppro.persistence.user.UserService;
import com.ppro.persistence.user.UserServiceImpl;
import com.ppro.persistence.userRole.UserRoleService;
import com.ppro.persistence.userRole.UserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arci on 28.11.2016.
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;


    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        User user = userService.findByUsername(userName);
        System.out.println("User : "+user);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getEnable(), true, true, true, getGrantedAuthorities(user));
    }


    private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//       find ID of roles which user has
        List<UserRole> roleIds = userRoleService.findByUserId(user.getId());

//        find all roles for user
        ArrayList<String> roles = new ArrayList<>();
        for (UserRole rolesId : roleIds) {
            roles.add(roleService.findOne(rolesId.getRoleid()).getRolename());
        }

        for(String  role : roles){
            System.out.println("UserProfile : "+role);
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
        }
        System.out.print("authorities :"+authorities);
        return authorities;
    }
}
