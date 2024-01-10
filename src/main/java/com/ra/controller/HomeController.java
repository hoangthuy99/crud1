package com.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")//mapping tổng hợp
    public String home(){
        return "home";
    }
   @GetMapping("/about") //lay du lieu tu get
    public String about(){
        return "about";
   }

}
