package com.richard.config;

import com.mongodb.DBObject;
import com.richard.models.accounts.internal.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.stereotype.Component;

/**
 * User: u0165547
 * Created: 11/13/2014 10:09 AM
 */
public class UserEventListener extends AbstractMongoEventListener<User> {
    private static final Log logger = LogFactory.getLog(UserEventListener.class);

    @Override
    public void onBeforeConvert(User user) {
        logger.debug("OnBeforeConvert");
        if (user.getId() == null || user.getId().isEmpty())
            user.setId("UserId");

        if (user.getCreated() == null)
            user.setCreated(DateTime.now());

        if (user.getLastModified() == null)
            user.setLastModified(DateTime.now());
    }

    @Override
    public void onBeforeSave(User user, DBObject dbo) {
        logger.debug("onBeforeSave");
    }

    @Override
    public void onAfterSave(User user, DBObject dbo) {
        logger.debug("onAfterSave");
    }

    @Override
    public void onAfterLoad(DBObject dbo) {
        logger.debug("onAfterLoad");
    }

    @Override
    public void onAfterConvert(DBObject dbo, User user) {
        logger.debug("onAfterConvert");
    }
}
