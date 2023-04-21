package com.maratonweb.apirunning.controller;

import com.maratonweb.apirunning.exceptions.ResourceNotFoundException;
import com.maratonweb.apirunning.model.Race;
import com.maratonweb.apirunning.service.RaceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/races")
@Slf4j
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create (@RequestBody Race race) {
        raceService.save(race);
        return race.getId();
    }

    @GetMapping()
    public List<Race> getAll () {
        return raceService.findAll();
    }

    @GetMapping("/{id}")
    public Race getAll (@PathVariable String id) throws ResourceNotFoundException {
        return raceService.findById(id).orElseThrow(() -> {
            log.error("Race with id " + id + " not found");
            return new ResourceNotFoundException(String.format("Race with id %s not found", id));
        });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable String id) throws ResourceNotFoundException {
        raceService.findById(id).orElseThrow(() -> {
            log.error("Race with id " + id + " not found");
            return new ResourceNotFoundException(String.format("Race with id %s not found", id));
        });
        raceService.delete(id);
    }


}
