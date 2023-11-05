package ru.sfedu.SysyemOfUniversityManagment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sfedu.SysyemOfUniversityManagment.model.Teacher;

@RestController
public class TestController {
    @GetMapping(value = "/test/teacher",produces = "application/json")
    public Teacher getTeacher(){
        Teacher teacher = new Teacher();
        teacher.setID(1);
        teacher.setName("Ivanov Ivan Ivanovich");
        return teacher;
    }
}
