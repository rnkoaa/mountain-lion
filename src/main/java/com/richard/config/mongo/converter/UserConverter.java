package com.richard.config.mongo.converter;

import com.mongodb.DBObject;
import com.richard.models.accounts.internal.User;
import org.springframework.core.convert.converter.Converter;

/**
 * User: u0165547
 * Created: 11/13/2014 4:11 PM
 */
public class UserConverter implements Converter<DBObject, User> {
    @Override
    public User convert(DBObject source) {
        return new User.UserBuilder()
                .firstName(source.get("firstname").toString())
                .id(source.get("id").toString())
                .lastName(source.get("lastname").toString())
                .emailAddress(source.get("emailAddress").toString())
                .isActive(Boolean.valueOf(source.get("isActive").toString())).build();
    }
}
