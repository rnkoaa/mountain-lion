package com.richard.models.accounts.internal;

import com.richard.models.accounts.Person;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created by rnkoaa on 8/11/14.
 */
@Document(collection = "users")
public class User extends Person {
    private final String emailAddress;
    private final String password;
    private boolean active;

    private Set<Role> roles;

    public User(){
        super(null, null, null);
        emailAddress = null;
        password = null;
    }

    public User(UserBuilder userBuilder) {
        super(userBuilder.firstName, userBuilder.lastName, userBuilder.middleName);
        this.active = userBuilder.active;
        this.roles = userBuilder.roles;
        this.emailAddress = userBuilder.emailAddress;
        this.password = userBuilder.password;
    }

    public boolean isActive() {
        return active;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder {
        private boolean active;
        private Set<Role> roles;
        private String firstName;
        private String lastName;
        private String middleName;
        private String emailAddress;
        private String password;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder isActive(boolean active) {
            this.active = active;
            return this;
        }

        public UserBuilder roles(Set<Role> roles) {
            this.roles = roles;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
