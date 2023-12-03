package com.cyber.demo.controller;

import com.cyber.demo.payload.request.StudentReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    ArrayList<StudentReq> listStudent = new ArrayList<>();
    @PostMapping ("/add1")
    public ResponseEntity<?> addRequestParam(@RequestParam StudentReq studentReq){
        listStudent.add(studentReq);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
    @PostMapping("/add2/{id}/{age}")
    public ResponseEntity<?> addPathVariable(@PathVariable String name,@PathVariable int age){
        StudentReq studentReq = new StudentReq();
        studentReq.setAge(age);
        studentReq.setName(name);
        listStudent.add(studentReq);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
    @PostMapping("/add3")
    public ResponseEntity<?> addRequestBody(@RequestBody StudentReq studentReq){
        listStudent.add(studentReq);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
}
