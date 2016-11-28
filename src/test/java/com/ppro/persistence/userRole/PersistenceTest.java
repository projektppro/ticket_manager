package com.ppro.persistence.userRole;

import com.ppro.TestSuperClass;
import com.ppro.model.*;
import com.ppro.persistence.airplane.AirplaneServiceImpl;
import com.ppro.persistence.person.PersonServiceImpl;
import com.ppro.persistence.role.RoleServiceImpl;
import com.ppro.persistence.ticket.TicketServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * Created by Arci on 24.11.2016.
 */
@Transactional
public class PersistenceTest extends TestSuperClass {

    @Autowired
    private UserRoleServiceImpl userRoleService;
    @Autowired
    private RoleServiceImpl roleService;
    @Autowired
    private AirplaneServiceImpl airplaneService;
    @Autowired
    private PersonServiceImpl personService;
    @Autowired
    private TicketServiceImpl ticketService;

    @Test
    @Rollback
    public void saveUserRole() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1);
        userRole.setUserid(1);
        userRole.setRoleid(1);
        userRoleService.saveUserRole(userRole);
        assertTrue(userRoleService.findAll().size() == 1);
    }

    @Test
    @Rollback
    public void saveRole() throws Exception {
        Role role = new Role();
        role.setId(1);
        role.setRolename("ADMIN");
        roleService.saveRole(role);
        assertTrue(roleService.findAll().size() == 1);

    }

    @Test
    @Rollback
    public void saveAirplane() throws Exception {
        Airplane airplane = new Airplane();
        airplane.setName("boing");
        airplane.setId(1);
        airplaneService.saveAirplane(airplane);
        assertTrue(airplaneService.findAll().size() == 1);

    }

    @Test
    @Rollback
    public void savePersone() throws Exception {
        Person person = new Person();
        person.setId(1);
        person.setDateofbirth(Timestamp.valueOf(LocalDateTime.now()));
        person.setFirstname("Franta");
        person.setLastname("Novak");
        personService.savePerson(person);
        assertTrue(personService.findAll().size()==1);
    }

    @Test
    public void saveTicket() throws Exception {
        Ticket ticket = new Ticket();
        ticket.setId(1);
        ticket.setAirplaneid(1);
        ticket.setPersonid(1);
        ticket.setDate(Timestamp.valueOf(LocalDateTime.now()));
        ticketService.saveTicket(ticket);
        assertTrue(ticketService.findAll().size()==1);

    }
}