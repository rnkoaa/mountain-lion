package com.richard.models.accounts;


import com.richard.models.AbstractEntity;

/**
 * Created by rnkoaa on 8/11/14.
 */
public abstract class Person extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
