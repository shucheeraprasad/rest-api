package com.rest.api.controller;

import com.rest.api.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/post/apis")
@RestController
public class PostController {

    @PostMapping(value = "/api1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student method1(@RequestBody Student student) {
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(student.getGrade());
        return student;
    }

}