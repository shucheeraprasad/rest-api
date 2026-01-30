package com.rest.api.controller;

import com.rest.api.model.Student;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/get/apis")
@RestController
public class GetController {

    @GetMapping(value = "/api1", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student method1() {
        Student student = new Student();
        student.setName("a1");
        student.setCourse("c1");
        student.setGrade(3.52D);
        return student;
    }

    @GetMapping(value="/api2", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> studentsV2() {
        Student student = new Student();
        student.setName("g12");
        student.setCourse("C14");
        student.setGrade(4.5);
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = "/api3", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> method3() {
        Student student = new Student();
        student.setName("a1");
        student.setCourse("c1");
        student.setGrade(3.52D);

        Student student2 = new Student();
        student2.setName("a1");
        student2.setCourse("c1");
        student2.setGrade(3.52D);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        return studentList;
    }

    @GetMapping(value = "/api4", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student method4(@RequestHeader(name = "name", required = false, defaultValue = "UNKNOWN") String name,
                           @RequestHeader(name = "course", required = false, defaultValue = "NO_COURSE") String course) {
        Student student = new Student();
        student.setName(name);
        student.setCourse(course);
        student.setGrade(3.52D);
        return student;
    }

    @GetMapping(value = "/api5", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student method5(@RequestParam(name = "name", required = false, defaultValue = "UNKNOWN") String name,
                           @RequestParam(name = "course", required = false, defaultValue = "NO_COURSE") String course) {
        Student student = new Student();
        student.setName(name);
        student.setCourse(course);
        student.setGrade(3.52D);
        return student;
    }

    @GetMapping(value = "/api6/{name}/{course}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student method6(@PathVariable(name = "name") String name,
                           @PathVariable(name = "course") String course) {
        Student student = new Student();
        student.setName(name);
        student.setCourse(course);
        student.setGrade(3.52D);
        return student;
    }

}