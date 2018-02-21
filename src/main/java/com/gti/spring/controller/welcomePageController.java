package com.gti.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sushilmainali on 21/02/2018.
 */


@Controller
@RequestMapping("/")
public class welcomePageController {

    public String home(Model map)
    {
        return "index";
    }
}
