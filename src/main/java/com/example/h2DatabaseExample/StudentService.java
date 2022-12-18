package com.example.h2DatabaseExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student createStudentData(Student student){
        repository.save(student);
        return student;
    }

    public Student getStudentData(String number){
        Student student = repository.findByRollNumber(number);
        System.out.println(student);
        return student;
    }

    /*
    public Student updateStudentData(String rollNumber){
        Student student = repository.findByRollNumber(rollNumber);
        int marks = student.getMarks();

    }

     */
}
