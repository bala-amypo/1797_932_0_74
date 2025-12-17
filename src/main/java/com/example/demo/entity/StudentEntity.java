package com.example.Art.Entity;

public class StudentEntity {
    private int id;
    private String name;
    private String email;
    private double cgpa;

    public StudentEntity(int id,String name,String email, double cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity(){

    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getCgpa() {
        return cgpa;
    }
}