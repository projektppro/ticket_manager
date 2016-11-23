package com.ppro.persistence.user;

import com.ppro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Arci on 22.11.2016.
 */
@Service
public class UserServiceImpl implements UserService {



    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;



    @Override
    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(id);
    }
}
