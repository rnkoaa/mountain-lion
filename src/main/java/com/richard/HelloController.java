package com.richard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rnkoaa on 11/10/14.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        return "home";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }

    @RequestMapping("/logout")
    public String logout(Model model) {
        return "hello";
    }
}
