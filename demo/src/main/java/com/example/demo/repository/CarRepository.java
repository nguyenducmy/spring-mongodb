package com.example.demo.repository;

import com.example.demo.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
    @Query("{'brand' : 'Toyota'}")
    List<Car> findToyota();
}
