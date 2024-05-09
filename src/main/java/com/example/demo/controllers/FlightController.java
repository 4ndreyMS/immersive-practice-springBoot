package com.example.demo.controllers;

import com.example.demo.models.FlightModel;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flight")
public class FlightController {
    @Autowired
    private FlightService flightService;


    @GetMapping("/getById/{id}")
    public ResponseEntity findById(@PathVariable long id) {
        return new ResponseEntity(flightService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody FlightModel flight) {
        return new ResponseEntity(flightService.createFlight(flight), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{flightId}")
    public ResponseEntity<Boolean> delete(@PathVariable long flightId) {
        return new ResponseEntity(flightService.delete(flightId), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<FlightModel>> getflightById() {
        List<FlightModel> flights = flightService.getAllFlights();
//        return new ResponseEntity<>(flightService.getAllFlights(), HttpStatus.OK);
        return ResponseEntity.ok(flights);
    }

    @PutMapping("/update")
    public ResponseEntity<FlightModel> updateflight(@RequestBody FlightModel flight) {
        return new ResponseEntity(flightService.updateFlight(flight), HttpStatus.OK);
    }
}
