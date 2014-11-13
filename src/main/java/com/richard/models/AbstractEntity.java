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
    private DateTime updated;

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

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
        this.updated = updated;
    }
}
