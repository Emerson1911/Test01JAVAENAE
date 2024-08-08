package com.emerson.Test01JAVAENAE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class departamnetotrabajoenae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreenae;
    private String telefonoenae;
    private String jefeenae;
    public departamnetotrabajoenae() {
    }
    public departamnetotrabajoenae(Long id, String nombreenae, String telefonoenae, String jefeenae) {
        this.id = id;
        this.nombreenae = nombreenae;
        this.telefonoenae = telefonoenae;
        this.jefeenae = jefeenae;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreenae() {
        return nombreenae;
    }
    public void setNombreenae(String nombreenae) {
        this.nombreenae = nombreenae;
    }
    public String getTelefonoenae() {
        return telefonoenae;
    }
    public void setTelefonoenae(String telefonoenae) {
        this.telefonoenae = telefonoenae;
    }
    public String getJefeenae() {
        return jefeenae;
    }
    public void setJefeenae(String jefeenae) {
        this.jefeenae = jefeenae;
    }

    


}
