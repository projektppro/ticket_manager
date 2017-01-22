package com.ppro.persistence.destination;

import com.ppro.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Roman on 22.1.2017.
 */
@Service("destinationService")
public class DestinationServiceImpl implements DestinationService {
    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationServiceImpl(@Qualifier("destinationRepository") DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public List<Destination> findAll() {
        return (List<Destination>) destinationRepository.findAll();
    }

    @Override
    public void saveDestination(Destination destination) {
        destinationRepository.save(destination);
    }

    @Override
    public Destination findOne(Integer id) {
        return destinationRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        destinationRepository.delete(id);
    }

    @Override
    public List<Destination> findByAirportName(String airportName) {
        return (List<Destination>) destinationRepository.findByAirportName(airportName);
    }
}
