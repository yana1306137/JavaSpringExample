package com.company.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {

    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String division;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId, String division) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = emailId;
        this.division = division;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
