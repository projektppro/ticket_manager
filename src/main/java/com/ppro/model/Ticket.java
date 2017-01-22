package com.ppro.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Arci on 22.11.2016.
 */
@Entity
public class Ticket {
    private int id;
    private Integer airplaneid;
    private Timestamp date;
    private Integer personid;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ticket_id_seq_gen")
    @SequenceGenerator(name = "ticket_id_seq_gen",sequenceName = "ticket_id_seq")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fligh_id")
    public Integer getAirplaneid() {
        return airplaneid;
    }

    public void setAirplaneid(Integer airplaneid) {
        this.airplaneid = airplaneid;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "personid")
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != ticket.id) return false;
        if (airplaneid != null ? !airplaneid.equals(ticket.airplaneid) : ticket.airplaneid != null) return false;
        if (date != null ? !date.equals(ticket.date) : ticket.date != null) return false;
        if (personid != null ? !personid.equals(ticket.personid) : ticket.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (airplaneid != null ? airplaneid.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
