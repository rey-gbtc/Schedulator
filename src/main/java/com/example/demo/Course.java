package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int fourDigitCode;
    // e.g. Basic courses, Cybersecurity, Web Development...
    private String category;

    // i.e. Subject-title, e.g. 'MS Word and Excel Foundations 18 hrs'
    private String subject;

    // e.g. CMP226, ITI240
    private String courseId;

    private int courseRegistrationNumber;


}
