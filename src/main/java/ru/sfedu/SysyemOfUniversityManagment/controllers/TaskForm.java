package ru.sfedu.SysyemOfUniversityManagment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskForm {
    @GetMapping("/taskform")
    public String task(){
        return "pract";
    }
}
