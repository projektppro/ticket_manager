package com.ppro.persistence.person;

import com.ppro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 25.11.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final PersoneRepository repository;

    @Autowired
    public PersonServiceImpl(@Qualifier("personeRepository") PersoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }

    @Override
    public void savePerson(Person person) {
        repository.save(person);
    }

    @Override
    public Person findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }

    @Override
    public List<Person> findByFirstname(String firstName) {
        return (List<Person>) repository.findByFirstname(firstName);
    }

    @Override
    public List<Person> findByLastname(String lastName) {
        return (List<Person>) repository.findByLastname(lastName);
    }

    @Override
    public List<Person> findByDateofbirth(Date date) {
        return (List<Person>) repository.findByDateofbirth(date);
    }

    @Override
    public List<Person> findByEmail(String email) {
        return (List<Person>) repository.findByEmail(email);
    }
}
