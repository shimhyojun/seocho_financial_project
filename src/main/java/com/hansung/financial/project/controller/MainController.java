package com.hansung.financial.project.controller;

import jdk.internal.module.IllegalAccessLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dashboard() {
        return "index";
    }

    @GetMapping("/buttons")
    public String test() {
        return "buttons";
    }

    @GetMapping("/cards")
    public String cards() { return "cards"; }

    @GetMapping("/charts")
    public ModelAndView charts() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("charts");

        return mav;
    }

    @GetMapping("/forgot-password")
    public String forgot_password() { return "forgot-password"; }

    @GetMapping("/login")
    public String login() { return "login"; }

    @GetMapping("/register")
    public String register() { return "register"; }

    @GetMapping("/tables")
    public String tables() { return "tables"; }

    @GetMapping("/blank")
    public String blank() { return "blank"; }

    @GetMapping("/utilities-animation")
    public String utilities_animation() { return "utilities-animation"; }

    @GetMapping("/utilities-border")
    public String utilities_border() { return "utilities-border"; }

    @GetMapping("/utilities-color")
    public String utilities_color() { return "utilities-color"; }

    @GetMapping("/utilities-other")
    public String utilities_other() { return "utilities-other"; }

}
