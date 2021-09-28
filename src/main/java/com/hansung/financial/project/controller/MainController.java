package com.hansung.financial.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dashboard() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
aa