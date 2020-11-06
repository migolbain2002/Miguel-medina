package com.example.PruebaBackEnd.Model;

import javax.persistence.*;

@Entity
@Table (name="Tbl_Country")
public class CountryModel {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryid;
    @Column
    private String name;

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryModel() {
    }
}
