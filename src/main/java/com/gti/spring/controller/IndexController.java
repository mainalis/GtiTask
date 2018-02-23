package com.gti.spring.controller;


import com.gti.spring.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gti.spring.entity.GuestDao;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sushilmainali on 21/02/2018.
 */


@Controller
public class IndexController {

    @Autowired
    private GuestDao guestDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model map)
    {
        return "index";
    }



    @RequestMapping(value="/guest", method = RequestMethod.POST)
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        System.out.println("insindrff dfndjfjdjfjh");
        if (name != null)
            guestDao.persist(new Guest(name));

        // Prepare the result view (guest.jsp):
        return new ModelAndView("guest", "guestDao", guestDao);
        //return "index";

    }


    }
