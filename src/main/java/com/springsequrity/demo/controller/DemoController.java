package com.springsequrity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 8e3Yn4uK on 22.03.2019
 */

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }
}
