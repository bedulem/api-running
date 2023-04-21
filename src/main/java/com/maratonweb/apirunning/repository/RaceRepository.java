package com.maratonweb.apirunning.repository;

import com.maratonweb.apirunning.model.Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends MongoRepository<Race,String> {

}
