package com.ppro.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by Arci on 22.11.2016.
 */
@Entity
public class Airplane {
    private Integer id;
    private String name;
    //private Integer kapacita;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "airplane_seq_gen")
    @SequenceGenerator(name = "airplane_seq_gen",sequenceName = "airplane_id_seq")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    @NotBlank(message = "Vyplňte jméno letadla")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //@Basic
    //@Column(name = "kapacita")
    /*@NotBlank(message = "Vyplňte kapacitu letadla.")
    @Max(value = 500, message = "Tolik se jich tam nevejde")
    public Integer getKapacita() {
        return kapacita;
    }

    public void setKapacita(Integer kapacita) {
        this.kapacita = kapacita;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airplane airplane = (Airplane) o;

        if (id != airplane.id) return false;
        if (name != null ? !name.equals(airplane.name) : airplane.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "id: "+id+" name: "+name;
    }
}
