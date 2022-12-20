package com.example.springselectshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class ShopController {

    @GetMapping("/shop")
    public ModelAndView shop() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("username","");
//        return modelAndView;

        return new ModelAndView("index");

    }
}