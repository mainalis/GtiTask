package com.gti.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sushilmainali on 21/02/2018.
 */


@Controller
@RequestMapping("/")
public class WelcomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model map)
    {
        return "index";
    }
}
