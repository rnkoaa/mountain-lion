package com.richard.config;

import com.richard.models.accounts.internal.User;
import com.richard.service.UserDetailServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;

/**
 * Created by rnkoaa on 11/10/14.
 */
@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home")
                .permitAll()
                .anyRequest()
                .authenticated();
        http
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Configuration
    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
        @Resource
        UserDetailsService userDetailsService;

        @Autowired
        UserDetailServiceCustom userDetailServiceCustom;

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userDetailsService);
            if (!userDetailServiceCustom.exists("r.ds@gmail.com")) {
                User user = new User.UserBuilder()
                        .emailAddress("r.ds@gmail.com")
                        .firstName("r")
                        .lastName("sd")
                        .isActive(true)
                        .password("mn")
                        .build();
                userDetailServiceCustom.save(user);
                System.out.println(user.getId() + " ==> Saved User Id");
            }
        }

    }

}
