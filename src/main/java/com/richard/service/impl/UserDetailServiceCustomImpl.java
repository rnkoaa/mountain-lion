package com.richard.service.impl;

import com.richard.models.accounts.internal.User;
import com.richard.repository.UserRepository;
import com.richard.service.UserDetailServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: u0165547
 * Created: 11/13/2014 3:41 PM
 */
@Service("userDetailServiceCustom")
public class UserDetailServiceCustomImpl implements UserDetailServiceCustom {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByEmailAddress(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress);
    }

    @Override
    public boolean exists(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress) != null;
    }
}
