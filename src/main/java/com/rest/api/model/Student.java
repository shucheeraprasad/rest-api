package com.rest.api.model;

import lombok.Data;

//@Getter
//@Setter
@Data
public class Student {

    private String name;
    private String course;
    private Double grade;

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }*/
}
