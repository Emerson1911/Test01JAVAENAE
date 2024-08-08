package com.emerson.Test01JAVAENAE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class marcaenae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreenae;

    public marcaenae() {
    }

    public marcaenae(Long id, String nombreenae) {
        this.id = id;
        this.nombreenae = nombreenae;
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

}
