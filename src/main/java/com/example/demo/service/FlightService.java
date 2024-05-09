package com.example.demo.service;

import com.example.demo.models.AirportModel;
import com.example.demo.models.FlightModel;
import com.example.demo.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public FlightService() {
    }

    //retrieve all
    public List<FlightModel> getAllFlights() {
        List<FlightModel> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flight -> flights.add(flight.toModel()));
        return flights;
    }
    // delete
    public boolean delete(long flightId) {
        try {
            flightRepository.deleteById(flightId);
            return  true;
        }catch (Exception e) {
            return false;
        }
    }
//    //update and create
//    public String save(FlightModel newFlight){
//
//        try{
//
//            if (!existFlightById(newFlight.getFlightCode())){
//                this.flightList.add(newFlight);
//                return "Created";
//            }
//
//            this.flightList.removeIf(flight ->  flight.getFlightCode().equals(newFlight.getFlightCode() ));
//            this.flightList.add(newFlight);
//            return "Updated";
//
//        }catch (Exception e){
//            System.out.println(e);
//            return "Error";
//        }
//    }

    public FlightModel createFlight(FlightModel flight){
        return flightRepository.save(flight.toEntity()).toModel();
    }

    public FlightModel updateFlight(FlightModel flight){
        return flightRepository.save(flight.toEntity()).toModel();
    }

    //get by id
    public FlightModel getById(long id){
        if (flightRepository.findById(id).isPresent()){
            return flightRepository.findById(id).get().toModel();
        }
        return null;
    }
}
