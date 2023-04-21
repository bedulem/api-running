package com.maratonweb.apirunning.service;

import com.maratonweb.apirunning.model.Race;
import com.maratonweb.apirunning.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceService {

    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public void save(Race race){
        raceRepository.save(race);
    }

    public List<Race> findAll(){
        return raceRepository.findAll();
    }

    public Optional<Race> findById(String id){
        return raceRepository.findById(id);
    }

    public void delete(String id){
        raceRepository.deleteById(id);
    }
}
