package com.emerson.Test01JAVAENAE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class categoriaanae {

    @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String nombreenae;
       private String descripcionanae;
       
    public categoriaanae() {

    }
    public categoriaanae(Long id, String nombreenae, String descripcionanae) {
        this.id = id;
        this.nombreenae = nombreenae;
        this.descripcionanae = descripcionanae;
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
    public String getDescripcionanae() {
        return descripcionanae;
    }
    public void setDescripcionanae(String descripcionanae) {
        this.descripcionanae = descripcionanae;
    }


}
