package com.ppro.persistence.destination;

import com.ppro.model.Destination;

import java.util.List;

/**
 * Created by Roman on 22.1.2017.
 */
public interface DestinationService {
    List<Destination> findAll();

    void saveDestination(Destination destination);

    Destination findOne(Integer id);

    void delete(Integer id);

    List<Destination> findByAirportName(String airportName);
}
