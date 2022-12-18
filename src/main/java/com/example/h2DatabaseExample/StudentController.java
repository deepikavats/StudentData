package com.example.h2DatabaseExample;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Controller
public class StudentController {

    @Autowired
    public StudentService service;

    @PostMapping(path = "/createStudent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> createStudent(@NotNull @RequestBody Student student){
        service.createStudentData(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping(path = "/getStudent", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudent(@RequestParam (name = "rollNumber") @NotNull String rollNumber){
    Student student = service.getStudentData(rollNumber);
    return ResponseEntity.ok(student);
    }

    @PostMapping(path = "/updateStudent", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> updateStudent(@RequestParam (name = "rollNumber") @NotNull String rollNumber){
        Student student = service.updateStudentData(rollNumber);
        return ResponseEntity.ok(student);
    }





}
