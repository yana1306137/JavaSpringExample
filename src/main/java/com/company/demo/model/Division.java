package com.company.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "divisi")
public class Division {

    private String divisioncode;
    private String divisionname;

    public Division(){

    }

    public Division(String divisioncode, String divisionname) {
        this.divisioncode = divisioncode;
        this.divisionname = divisionname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public String getDivisioncode() {
        return divisioncode;
    }

    public void setDivisioncode(String divisioncode) {
        this.divisioncode = divisioncode;
    }

    public String getDivisionname() {
        return divisionname;
    }

    public void setDivisionname(String divisionname) {
        this.divisionname = divisionname;
    }
}
