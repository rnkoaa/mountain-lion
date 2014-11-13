package com.richard.service;


import com.richard.models.accounts.internal.User;

/**
 * User: u0165547
 * Created: 11/13/2014 3:39 PM
 */
public interface UserDetailServiceCustom {

    User save(User user);

    User update(User user);

    User findById(String id);

    User findByEmailAddress(String emailAddress);

    boolean exists(String emailAddress);

}
