package com.hansung.financial.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
    @RequestMapping("/")
    public String dashboard() {
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        return "index";
    }
}
