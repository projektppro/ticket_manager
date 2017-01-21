package com.ppro.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Arci on 21.1.2017.
 */
@Entity
public class Destination {
    private String airport;
    private String towen;
    private String country;
    private Integer countyid;
    private Integer destinationid;
    private int id;

    @Basic
    @Column(name = "airport")
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    @Basic
    @Column(name = "towen")
    public String getTowen() {
        return towen;
    }

    public void setTowen(String towen) {
        this.towen = towen;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "countyid")
    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    @Basic
    @Column(name = "destinationid")
    public Integer getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(Integer destinationid) {
        this.destinationid = destinationid;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Destination that = (Destination) o;

        if (id != that.id) return false;
        if (airport != null ? !airport.equals(that.airport) : that.airport != null) return false;
        if (towen != null ? !towen.equals(that.towen) : that.towen != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (countyid != null ? !countyid.equals(that.countyid) : that.countyid != null) return false;
        if (destinationid != null ? !destinationid.equals(that.destinationid) : that.destinationid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = airport != null ? airport.hashCode() : 0;
        result = 31 * result + (towen != null ? towen.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (countyid != null ? countyid.hashCode() : 0);
        result = 31 * result + (destinationid != null ? destinationid.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
