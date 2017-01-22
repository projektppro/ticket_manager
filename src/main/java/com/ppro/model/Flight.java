package com.ppro.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Arci on 21.1.2017.
 */
@Entity
public class Flight {
    private String flightName;
    private Timestamp departureTime;
    private String departurePlace;
    private Integer flightId;
    private String arrivalsPlace;
    private Integer cost;
    private int id;

    @Basic
    @Column(name = "flight_name")
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    @Basic
    @Column(name = "departure_time")
    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "departure_place")
    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    @Basic
    @Column(name = "flight_id")
    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Basic
    @Column(name = "arrivals_place")
    public String getArrivalsPlace() {
        return arrivalsPlace;
    }

    public void setArrivalsPlace(String arrivalsPlace) {
        this.arrivalsPlace = arrivalsPlace;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "flight_id_seq_gen")
    @SequenceGenerator(name = "flight_id_seq_gen",sequenceName = "flight_id_seq")
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

        Flight flight = (Flight) o;

        if (id != flight.id) return false;
        if (flightName != null ? !flightName.equals(flight.flightName) : flight.flightName != null) return false;
        if (departureTime != null ? !departureTime.equals(flight.departureTime) : flight.departureTime != null)
            return false;
        if (departurePlace != null ? !departurePlace.equals(flight.departurePlace) : flight.departurePlace != null)
            return false;
        if (flightId != null ? !flightId.equals(flight.flightId) : flight.flightId != null) return false;
        if (arrivalsPlace != null ? !arrivalsPlace.equals(flight.arrivalsPlace) : flight.arrivalsPlace != null)
            return false;
        if (cost != null ? !cost.equals(flight.cost) : flight.cost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = flightName != null ? flightName.hashCode() : 0;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (departurePlace != null ? departurePlace.hashCode() : 0);
        result = 31 * result + (flightId != null ? flightId.hashCode() : 0);
        result = 31 * result + (arrivalsPlace != null ? arrivalsPlace.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
