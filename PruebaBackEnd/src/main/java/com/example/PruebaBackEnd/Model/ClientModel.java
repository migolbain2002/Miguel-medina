package com.example.PruebaBackEnd.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.DateTimeException;
import java.util.Date;

@Entity
@Table(name = "Tbl_Client")

public class ClientModel {

    @Id
    @Column (name = "clientid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientid;
    @Column (name = "name")
    private String name;
    @Column (name = "lastname")
    private String lastname;
    @Column (name = "identification")
    private String identification;
    @Column (name = "identification_type")
    private String identification_type;
    @Column (name = "creation_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date fecha = new Date();
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn (name = "cityid")
    private CityModel cityid;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn (name = "countryid")
    private CountryModel countryid;

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getIdentification_type() {
        return identification_type;
    }

    public void setIdentification_type(String identification_type) {
        this.identification_type = identification_type;
    }

    public CityModel getCityid() {
        return cityid;
    }

    public void setCityid(CityModel cityid) {
        this.cityid = cityid;
    }

    public CountryModel getCountryid() {
        return countryid;
    }

    public void setCountryid(CountryModel countryid) {
        this.countryid = countryid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

