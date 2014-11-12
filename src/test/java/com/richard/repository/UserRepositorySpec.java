package com.richard.repository;

import com.richard.config.MongoConfig;
import com.richard.models.accounts.internal.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rnkoaa on 11/11/14.
 */
@ContextConfiguration(classes = {MongoConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositorySpec {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testMongoRepository() {
         assertNotNull(userRepository);
        User user = new User();
    }
}
