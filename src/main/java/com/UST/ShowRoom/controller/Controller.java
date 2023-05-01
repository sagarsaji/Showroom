package com.UST.ShowRoom.controller;

import com.UST.ShowRoom.entity.Showroom;
import com.UST.ShowRoom.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/showroom")
public class Controller {
    @Autowired
    private CarService services;
    @PostMapping("/add")
    public Showroom addCars(@RequestBody Showroom show){
        return services.addCar(show);

    }
    @GetMapping("/get")
    public List<Showroom> getCars() {
        return services.getAllCars();
    }
//    @GetMapping("/get1/{}")
//    public Showroom getBy

}