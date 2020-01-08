package com.company.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {

    private long id;
    private String firstname;
    private String lastname;
    private String email;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = emailId;
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
}
