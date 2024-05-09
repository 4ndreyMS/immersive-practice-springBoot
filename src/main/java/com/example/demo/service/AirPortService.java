package com.example.demo.service;

import com.example.demo.controllers.AirPortController;
import com.example.demo.entity.AirportEntity;
import com.example.demo.models.AirportModel;
import com.example.demo.models.FlightModel;
import com.example.demo.models.UserModel;
import com.example.demo.repositories.AirportRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AirPortService {

    @Autowired
    private AirportRepository airportRepository;

    public AirPortService() {
    }




    public AirportModel getById(long id) {
        if (airportRepository.findById(id).isPresent()){
            return airportRepository.findById(id).get().toAirportModel();
        }
        return null;
    }

    //update and create
    public AirportModel save(AirportModel newAirport) {

        if (null == getById(newAirport.getId())) {
            return airportRepository.save(newAirport.toEntity()).toAirportModel();
        }else {
            return airportRepository.save(newAirport.toEntity()).toAirportModel();
        }
    }

    //    todo: delete
    public boolean delete(long flightId) {
        airportRepository.deleteById(flightId);
        return true;
    }

    //todo: get all
    public List<AirportModel> getAll() {
        List<AirportModel> airportList = new ArrayList<>();
        airportRepository.findAll().forEach(airport -> airportList.add(airport.toAirportModel()));
        return airportList;
    }
}
