package com.richard.service.impl;

import com.richard.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: u0165547
 * Created: 11/11/2014 4:35 PM
 */
@Component("userDetailService")
public class MongoUserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return new CustomUserDetails("user", "kwame", getAuthorities(1));
    }

    public List<GrantedAuthority> getAuthorities(Integer role) {
        List<GrantedAuthority> authList = new ArrayList<>();
        if (role == 1) {
            authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        } else if (role == 2) {
            authList.add(new SimpleGrantedAuthority("ROLE_CAMPAIGN"));
        }
        return authList;
    }

    public static class CustomUserDetails implements UserDetails {

        private final String username;
        private final String password;
        private final Collection<? extends GrantedAuthority> authorities;
        private User user;

        public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
            this.username = username;
            this.password = password;
            this.authorities = authorities;
        }

        public CustomUserDetails(User user) {
            username = user.getUsername();
            password = user.getPassword();
            authorities = null;
            this.user = user;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return authorities;
        }

        @Override
        public String getPassword() {
            return password;
        }

        @Override
        public String getUsername() {
            return username;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
