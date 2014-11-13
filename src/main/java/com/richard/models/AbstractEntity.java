package com.richard.models;


import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

/**
 * Created by rnkoaa on 8/11/14.
 */
public class AbstractEntity {
    @Id
    private String id;

    private DateTime created;
    private DateTime lastModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(DateTime updated) {
        this.lastModified = updated;
    }
}
