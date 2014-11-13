package com.richard.config.mongo.converter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.richard.models.accounts.internal.User;
import org.springframework.core.convert.converter.Converter;

/**
 * User: u0165547
 * Created: 11/13/2014 4:20 PM
 */
public class UserToDBOjbectConverter implements Converter<User, DBObject> {
    @Override
    public DBObject convert(User source) {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("id", source.getId());
        dbObject.put("firstname", source.getFirstName());
        dbObject.put("lastname", source.getLastName());
        dbObject.put("emailAddress", source.getEmailAddress());
        dbObject.put("isActive", source.isActive());
        return dbObject;
    }
}
