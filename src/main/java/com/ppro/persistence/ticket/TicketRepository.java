package com.ppro.persistence.ticket;

import com.ppro.model.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by Arci on 24.11.2016.
 */
public interface TicketRepository extends CrudRepository<Ticket,Integer> {
    Iterable<Ticket> findByDate(Date date);

    Iterable<Ticket> findByAirplaneid(int id);

    Iterable<Ticket> findByPersonid(int id);
}
