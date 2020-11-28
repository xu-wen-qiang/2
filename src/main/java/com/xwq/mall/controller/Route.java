package com.xwq.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("sys")
public class Route {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("main")
    public String main(){
        return "pages/main";
    }
    @RequestMapping("login")
    public String login(){
        return "pages/login";
    }
    @RequestMapping("register")
    public String register(){
        return "pages/register";
    }
    @RequestMapping("item")
    public String item(){
        return "pages/item";
    }
    @RequestMapping("search")
    public String search(){
        return "pages/search";
    }
}
