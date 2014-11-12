package com.richard.models.accounts.internal;


import com.richard.models.AbstractEntity;

/**
 * Created by rnkoaa on 8/11/14.
 */
public class Role extends AbstractEntity {

    private final String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (!name.equals(role.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
