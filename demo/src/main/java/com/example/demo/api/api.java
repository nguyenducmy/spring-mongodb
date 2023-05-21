package com.example.demo.api;

import com.example.demo.entity.Car;
//import com.example.demo.repository.CarRepository;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class api {
    @Autowired
    CarRepository carRepository;
    @PostMapping("/new-car")
    public String newCar(@RequestBody Car car){
        carRepository.save(car);
        return "post new car";
    }
    @GetMapping("/cars")
    public List<Car> cars(){
        System.out.println(carRepository.findAll());
        return carRepository.findAll();
    }
}
