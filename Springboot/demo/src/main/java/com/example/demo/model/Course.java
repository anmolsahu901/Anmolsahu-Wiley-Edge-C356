package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
//import  javax.persistence.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "COURSE_TBL")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String abbr;
    private int module;
    private double price;

    @ManyToMany(mappedBy = "courses", fetch =  FetchType.LAZY)
    @JsonBackReference
    private Set<Student> students;



}
