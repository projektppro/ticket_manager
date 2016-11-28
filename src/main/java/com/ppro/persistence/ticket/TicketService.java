package com.ppro.persistence.ticket;

import com.ppro.model.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
public interface TicketService {

    List<Ticket> findAll();

    void saveTicket(Ticket role);

    Ticket findOne(Integer id);

    void delete(Integer id);

    List<Ticket> findByDate(Date date);

    List<Ticket> findByAirplaneid(int id);

    List<Ticket> findByPersonid(int id);
}
