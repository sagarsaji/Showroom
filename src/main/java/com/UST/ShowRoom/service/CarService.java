package com.UST.ShowRoom.service;

import com.UST.ShowRoom.entity.Showroom;
import com.UST.ShowRoom.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {
    @Autowired
    private Repo repo;
    public Showroom addCar(Showroom show) {

        return repo.save(show);
    }




    public List<Showroom> getAllCars() {
        return repo.findAll();
    }
}
