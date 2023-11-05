package ru.sfedu.SysyemOfUniversityManagment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DebCOnt {
    @GetMapping("/h")
    public String hello(){
        return "ind";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/h1")
    public String hello1(){
        return "ind";
    }
}
