package com.example.demo.api;

import com.example.demo.entity.Car;
//import com.example.demo.repository.CarRepository;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class api {
    @Autowired
    CarRepository carRepository;
    @Autowired
    MongoTemplate mongoTemplate;
    @PostMapping("/new-car")
    public String newCar(@RequestBody Car car){
        carRepository.save(car);
        return "post new car";
    }
    @GetMapping("/cars")
    public List<Car> cars(){
        System.out.println(carRepository.findAll());
        Query query = new Query();
        query.addCriteria(Criteria.where("brand").is("Toyota"));
        List<Car> carList = mongoTemplate.find(query, Car.class);
        for (Car i : carList) {
            System.out.println(i.getBrand() + " -  " + i.getModel()
                    +  " -- " + i.getColor() + "  -  " + i.getId());
        }
        return carRepository.findToyota();
    }
}
