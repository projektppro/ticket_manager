package com.ppro.persistence.flight;

import com.ppro.model.Flight;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Arci on 22.1.2017.
 */
public interface FlightRepository extends CrudRepository<Flight,Integer> {

}
