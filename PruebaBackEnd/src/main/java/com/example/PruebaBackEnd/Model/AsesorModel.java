package com.example.PruebaBackEnd.Model;

import javax.persistence.*;

@Entity
@Table(name = "Tbl_Asesor")
public class AsesorModel {

    @Id
    @Column (name="asesorid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int asesorid;
    @Column (name = "fullname")
    private String fullname;
    @Column (name = "identification")
    private String identification;
    @Column (name = "identification_type")
    private String identification_type;
    @Column (name = "experience_years")
    private int experience_years;
    @Column (name = "speciality")
    private String speciality;
    @Column (name = "begin_timeatention")
    private int begin_timeatention;
    @Column (name = "end_timeatention")
    private int end_timeatention;


    public AsesorModel() {
    }

    public int getAsesorid() {
        return asesorid;
    }

    public void setAsesorid(int asesorid) {
        this.asesorid = asesorid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public int getExperience_years() {
        return experience_years;
    }

    public void setExperience_years(int experience_years) {
        this.experience_years = experience_years;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getBegin_timeatention() {
        return begin_timeatention;
    }

    public void setBegin_timeatention(int begin_timeatention) {
        this.begin_timeatention = begin_timeatention;
    }

    public int getEnd_timeatention() {
        return end_timeatention;
    }

    public void setEnd_timeatention(int end_timeatention) {
        this.end_timeatention = end_timeatention;
    }


}
