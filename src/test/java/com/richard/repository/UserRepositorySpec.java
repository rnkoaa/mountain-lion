package com.richard.repository;

import com.richard.config.MongoConfig;
import com.richard.config.WebConfig;
import com.richard.models.accounts.internal.User;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rnkoaa on 11/11/14.
 */
@ContextConfiguration(classes = {MongoConfig.class, WebConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositorySpec {

    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup() {
        userRepository.deleteAll();
    }

    @Before
    public void setUp() {
        userRepository.deleteAll();
    }

    @Test
    public void testMongoRepository() {
        assertNotNull(userRepository);
        User user = new User.UserBuilder()
                .emailAddress("richard.agyei@gmail.com")
                .firstName("Richard")
                .lastName("agyei")
                .isActive(true)
                .password("nana")
                .build();
        assert (user.getCreated() == null);
        assert (user.getLastModified() == null);
        User saved = userRepository.save(user);
        assertNotNull(saved);
        System.out.println("Test: UserId ==> " + saved.getId());
        System.out.println("Test: DateCreated ==> " + saved.getCreated().toString(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ")));
        System.out.println("Test: LastModifiedDate ==> " + saved.getLastModified().toString(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ")));
    }
}
