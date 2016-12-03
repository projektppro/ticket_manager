package com.ppro.persistence.person;

import com.ppro.model.Person;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 25.11.2016.
 */
public interface PersonService {
    List<Person> findAll();

    void savePerson(Person Person);

    Person findOne(Integer id);

    void delete(Integer id);

    List<Person> findByFirstname(String firstName);
    List<Person> findByLastname(String lastName);
    List<Person> findByDateofbirth(Date date);
}
