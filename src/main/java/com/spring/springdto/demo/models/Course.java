package com.spring.springdto.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private Long id;

    private String name;

    private String cost;

    private String time;
}
