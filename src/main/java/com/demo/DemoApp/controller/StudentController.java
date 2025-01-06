package com.demo.DemoApp.controller;

import com.demo.DemoApp.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(

            new Student(1, "John", 60),
            new Student(2, "Kiran", 80),
            new Student(3,"Steve",75)
    ));

    @GetMapping ("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping ("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

}
