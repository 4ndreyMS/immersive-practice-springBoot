package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Session")
public class SessionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
