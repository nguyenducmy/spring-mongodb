package com.example.demo;

import com.example.demo.entity.Car;
//import com.example.demo.repository.CarRepository;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    CarRepository carRepository;

//    @PostConstruct
//    public void postConstruct(){
//        Car car = new Car();
//        car.setBrand("Toyota");
//        car.setModel("Lexus");
//        car.setColor("white");
//        carRepository.save(car);
//    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        CommandLineRunner commandLineRunner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Car car = new Car();
                car.setBrand("Toyota");
//                car.setModel("Lexus");
                car.setColor("Red");
                System.out.println(car);

            }
        };
    }

}
