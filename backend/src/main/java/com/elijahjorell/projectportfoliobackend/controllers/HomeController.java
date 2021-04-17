package com.elijahjorell.projectportfoliobackend.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
@CrossOrigin("*")
public class HomeController {

    private static final Log LOGGER = LogFactory.getLog(HomeController.class);

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        System.out.println("GET");
        return "Hello";
    }

}
