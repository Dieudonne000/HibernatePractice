package com.models;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lapId;
    private String lapDesc;
    @ManyToOne
    private Student student;

    public int getLapId() {
        return lapId;
    }
    public void setLapId(int lapId) {
        this.lapId = lapId;
    }
    public String getLapDesc() {
        return lapDesc;
    }
    public void setLapDesc(String lapDesc) {
        this.lapDesc = lapDesc;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
}
