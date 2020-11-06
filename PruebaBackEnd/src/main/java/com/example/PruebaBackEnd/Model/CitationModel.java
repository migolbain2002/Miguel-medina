package com.example.PruebaBackEnd.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tbl_Citation")
public class CitationModel {

    @Id
    @Column(name = "citationid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citationid;
    @Column (name = "status")
    private String status;
    @Column (name = "begin_citationtime")
    private int begin_citationtime;
    @Column (name = "end_citationtime")
    private int end_citationtime;
    @Column (name = "citation_date")
    private String citation_date;
    @Column (name = "creation_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date creation_date = new Date();
    @ManyToOne(cascade = {CascadeType.REFRESH})

    @JoinColumn (name = "asesorid")
    private AsesorModel asesorid;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn (name = "clientid")
    private ClientModel clientid;

    public CitationModel() {
    }

    public int getCitationid() {
        return citationid;
    }

    public void setCitationid(int citationid) {
        this.citationid = citationid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBegin_citationtime() {
        return begin_citationtime;
    }

    public void setBegin_citationtime(int begin_citationtime) {
        this.begin_citationtime = begin_citationtime;
    }

    public int getEnd_citationtime() {
        return end_citationtime;
    }

    public void setEnd_citationtime(int end_citationtime) {
        this.end_citationtime = end_citationtime;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public AsesorModel getAsesorid() {
        return asesorid;
    }

    public void setAsesorid(AsesorModel asesorid) {
        this.asesorid = asesorid;
    }

    public ClientModel getClientid() {
        return clientid;
    }

    public void setClientid(ClientModel clientid) {
        this.clientid = clientid;
    }

    public String getCitation_date() {
        return citation_date;
    }

    public void setCitation_date(String citation_date) {
        this.citation_date = citation_date;
    }
}
