package com.richard.repository;

import com.richard.models.accounts.internal.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rnkoaa on 11/11/14.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findById(String id);

    User findByEmailAddress(String emailAddress);
}
