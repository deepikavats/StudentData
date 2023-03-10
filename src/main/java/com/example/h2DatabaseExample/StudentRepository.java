package com.example.h2DatabaseExample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

    Student findByRollNumber(String number);
}
