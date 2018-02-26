package com.gti.spring.controller;


import com.gti.spring.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by sushilmainali on 21/02/2018.
 */


@Controller
public class IndexController {

    @Autowired
    private GuestDao guestDao;

    @Autowired
    private AnimalDao animalDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model map)
    {
        return "index";
    }



    @RequestMapping(value="/guest", method = RequestMethod.POST)
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        if (name != null)
        {

            guestDao.persist(new Guest(name));
            animalDao.persist();
        }

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("guestDao", guestDao);
        myModel.put("animalDao", animalDao);


        // Prepare the result view (guest.jsp):
        return new ModelAndView("guest", myModel);
        //return "index";

    }

    @RequestMapping(value = "/insertAnimal", method = RequestMethod.POST)
    public ResponseEntity<Animal> enterAnimal(@RequestBody MountainGoat animal) {

        Animal tt = animal;
        animalDao.persistGMountainGoat(animal);
        return new ResponseEntity<>(animal, HttpStatus.OK);

    }


    @RequestMapping(value = "/PostFormDataByMap", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> PostFormDataByMap(@RequestBody Map<String, Object> obj) {

        Map<String, Object> pp =obj;

        return obj;
    }


    @RequestMapping(value="/getAllAnimal", method = RequestMethod.GET)
    public ResponseEntity<List<Animal>> getAllAnimal()
    {

        List<Animal> animalList = animalDao.getAllAnimals();
        return new ResponseEntity<List<Animal>>(animalList, HttpStatus.OK);

    }
}
