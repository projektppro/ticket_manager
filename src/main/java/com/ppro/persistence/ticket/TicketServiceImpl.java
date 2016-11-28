package com.ppro.persistence.ticket;

import com.ppro.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 24.11.2016.
 */
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository repository;
    @Autowired
    public TicketServiceImpl(@Qualifier("ticketRepository") TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Ticket> findAll() {
        return (List<Ticket>) repository.findAll();
    }

    @Override
    public void saveTicket(Ticket role) {
        repository.save(role);
    }

    @Override
    public Ticket findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }

    @Override
    public List<Ticket> findByDate(Date date) {
        return (List<Ticket>) repository.findByDate(date);
    }

    @Override
    public List<Ticket> findByAirplaneid(int id) {
        return (List<Ticket>) repository.findByAirplaneid(id);
    }

    @Override
    public List<Ticket> findByPersonid(int id) {
        return (List<Ticket>) repository.findByPersonid(id);
    }
}
