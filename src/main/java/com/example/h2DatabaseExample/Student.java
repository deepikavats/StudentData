package com.example.h2DatabaseExample;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Indexed;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
//import org.springframework.data.redis.core.index.Indexed;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "marks")
    public String marks;

    @Id
    @Column(name = "rollNumber")
    public int rollNumber;
}
