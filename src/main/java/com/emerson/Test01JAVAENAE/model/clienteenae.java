package com.emerson.Test01JAVAENAE.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clienteenae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreenae;
    private String direccionenae;
    private LocalDate fechanacimientoenae;
    private double sueldoenae;
    private byte estatusenae;
    public clienteenae() {
    }
    public clienteenae(Long id, String nombreenae, String direccionenae, LocalDate fechanacimientoenae,
            double sueldoenae, byte estatusenae) {
        this.id = id;
        this.nombreenae = nombreenae;
        this.direccionenae = direccionenae;
        this.fechanacimientoenae = fechanacimientoenae;
        this.sueldoenae = sueldoenae;
        this.estatusenae = estatusenae;
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
    public String getDireccionenae() {
        return direccionenae;
    }
    public void setDireccionenae(String direccionenae) {
        this.direccionenae = direccionenae;
    }
    public LocalDate getFechanacimientoenae() {
        return fechanacimientoenae;
    }
    public void setFechanacimientoenae(LocalDate fechanacimientoenae) {
        this.fechanacimientoenae = fechanacimientoenae;
    }
    public double getSueldoenae() {
        return sueldoenae;
    }
    public void setSueldoenae(double sueldoenae) {
        this.sueldoenae = sueldoenae;
    }
    public byte getEstatusenae() {
        return estatusenae;
    }
    public void setEstatusenae(byte estatusenae) {
        this.estatusenae = estatusenae;
    }

    
}
