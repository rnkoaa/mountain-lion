package com.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: u0165547
 * Created: 11/11/2014 4:23 PM
 */
@Controller
public class AuthController {


    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }


    @RequestMapping("/logout")
    public String logout(Model model) {
        return "hello";
    }
}
