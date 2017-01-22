package com.ppro.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Arci on 21.1.2017.
 */
@Entity
public class Destination {
    private int id; // id destinace
    @NotBlank(message = "Vyplňte jméno letiště.")
    private String airportName; //název letiště např. Letiště Václava Havla
    private String city; // název města např. Praha
    private String country; //stát - název např. Česrká republika
    private String countryCode; //zkratka státu ČR

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "airportName")
    public String getAirportName() {return airportName;}
    public void setAirportName(String airportName) { this.airportName = airportName;}

    @Basic
    @Column(name = "city")
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "countryCode")
    public String getCountryCode() {return countryCode;}
    public void setCountryCode(String countryCode) {this.countryCode = countryCode;}

    public Destination(int id, String airportName, String city, String country, String countryCode) {
        this.id = id;
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Destination that = (Destination) o;

        if (id != that.id) return false;
        if (airportName != null ? !airportName.equals(that.airportName) : that.airportName != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = airportName != null ? airportName.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
