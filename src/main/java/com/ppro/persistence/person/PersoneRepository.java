package com.ppro.persistence.person;

import com.ppro.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by Arci on 25.11.2016.
 */
public interface PersoneRepository extends CrudRepository<Person,Integer> {
    Iterable<Person> findByFirstname(String firstName);
    Iterable<Person> findByLastname(String lastName);
    Iterable<Person> findByDateofbirth(Date date);
}
