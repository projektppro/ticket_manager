package com.ppro.model;

import org.hibernate.validator.constraints.Email;

/**
 * Created by Arci on 22.1.2017.
 */
public class Objednavka {
    String jmeno;
    String prijmeni;
    String email;
    Integer idLetu;

    public Integer getIdLetu() {
        return idLetu;
    }

    public void setIdLetu(Integer idLetu) {
        this.idLetu = idLetu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
