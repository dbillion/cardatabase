package com.daiyior.cardatabase.web;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.daiyior.cardatabase.domain.Car;
import com.daiyior.cardatabase.domain.CarRepository;

@RestController
public class CarController {

    
    private final CarRepository repository;

    public CarController(CarRepository repository){
        this.repository=repository;
    }
    @GetMapping("/cars")
    public Iterable<Car> getCars()  throws IOException {
        return repository.findAll();
    }


}
