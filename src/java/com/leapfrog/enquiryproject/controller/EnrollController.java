/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enquiryproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Deepika
 */
@Controller
@RequestMapping(value="/enroll")
public
        class EnrollController {
     @RequestMapping(method= RequestMethod.GET)
    public String index(){
        return "enroll/index";
    }
    
}
