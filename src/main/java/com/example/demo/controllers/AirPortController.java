package com.example.demo.controllers;

import com.example.demo.models.AirportModel;
import com.example.demo.models.FlightModel;
import com.example.demo.service.AirPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("airport")
public class AirPortController {
    @Autowired
    private AirPortService airportService;


    @GetMapping("/getById/{id}")
    public ResponseEntity findById(@PathVariable long id) {
        return new ResponseEntity(airportService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody AirportModel airport) {
        return new ResponseEntity(airportService.save(airport), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{flightId}")
    public ResponseEntity delete(@PathVariable long flightId) {
        return new ResponseEntity<>(airportService.delete(flightId), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity getflightById() {
        return new ResponseEntity<>(airportService.getAll(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateflight(@RequestBody  AirportModel airport) {
        return new ResponseEntity(airportService.save(airport), HttpStatus.OK);
    }
}