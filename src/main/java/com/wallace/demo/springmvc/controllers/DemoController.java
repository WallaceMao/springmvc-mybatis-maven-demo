package com.wallace.demo.springmvc.controllers;

import com.wallace.demo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by  on 2017/7/14.Wallace
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String str = userService.sayUserHello("Wallace");
        return str;
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(){
        String str = userService.getUserList();
        return str;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(ModelMap model){
        model.addAttribute("name", "Wallace");
        return "hello";
    }
}
