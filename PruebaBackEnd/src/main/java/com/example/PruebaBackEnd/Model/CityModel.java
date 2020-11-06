package com.example.PruebaBackEnd.Model;

import javax.persistence.*;

@Entity
@Table (name="Tbl_City")
public class CityModel {
    @Id
    @Column (name = "cityid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityid;
    @Column (name = "name")
    private String name;

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityModel() {
    }
}
