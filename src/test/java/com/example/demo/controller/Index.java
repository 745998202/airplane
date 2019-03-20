package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.bag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
    @RequestMapping("/index")
    public String reIndex(ModelMap map)
    {
        bag[] bags = new bag[]{};
        User us = new User(0,0,0,bags);
        map.put("us",us);
        return "index";
    }
}
