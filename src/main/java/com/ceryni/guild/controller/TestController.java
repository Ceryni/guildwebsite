package com.ceryni.guild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Ceryni
 * Date: 8/31/13
 * Time: 4:45 AM
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String welcome(){
        return "index";
    }
}

