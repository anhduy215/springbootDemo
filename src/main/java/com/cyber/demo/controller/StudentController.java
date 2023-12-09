package com.cyber.demo.controller;

import com.cyber.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {


    ArrayList<Student> listStudent = new ArrayList<>();

    @PostMapping ("/add1")
    public ResponseEntity<?> addRequestParam(@RequestParam Student student){
        listStudent.add(student);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
    @PostMapping("/add2/{id}/{age}")
    public ResponseEntity<?> addPathVariable(@PathVariable String name,@PathVariable int age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        listStudent.add(student);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
    @PostMapping("/add3")
    public ResponseEntity<?> addRequestBody(@RequestBody Student student){
        listStudent.add(student);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
}
