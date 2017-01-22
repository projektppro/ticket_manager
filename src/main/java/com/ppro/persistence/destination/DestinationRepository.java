package com.ppro.persistence.destination;

import com.ppro.model.Destination;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Roman on 22.1.2017.
 */
public interface DestinationRepository extends CrudRepository<Destination, Integer> {
    Iterable<Destination> findByAirportName(String airportName);
}
