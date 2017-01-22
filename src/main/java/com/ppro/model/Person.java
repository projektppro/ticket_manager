package com.ppro.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by Arci on 22.11.2016.
 */
@Entity
public class Person {
    private int id;
    private Timestamp dateofbirth;
    private String firstname;
    private String lastname;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateofbirth")
    @NotBlank(message = "Fill your date of birth")
    public Timestamp getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Timestamp dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Basic
    @Column(name = "firstname")
    @NotBlank(message = "Fill your first name")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    @NotBlank(message = "Fill your last name")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (dateofbirth != null ? !dateofbirth.equals(person.dateofbirth) : person.dateofbirth != null) return false;
        if (firstname != null ? !firstname.equals(person.firstname) : person.firstname != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateofbirth != null ? dateofbirth.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
