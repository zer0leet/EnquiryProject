/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enquiryproject.controller;

import com.leapfrog.enquiryproject.dao.CourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Deepika
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    private CourseDAO courseDAO;
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) throws Exception {
         map.addAttribute("courses", courseDAO.getAll());
        return "course/index";
    }

    @RequestMapping(value = "/detail/id", method = RequestMethod.GET)
    public String detail(@PathVariable("id") int id,ModelMap map) throws Exception {
         map.addAttribute("course", courseDAO.getById(id));
        return "course/index";
    }
}
