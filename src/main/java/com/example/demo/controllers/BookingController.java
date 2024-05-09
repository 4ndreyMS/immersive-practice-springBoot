package com.example.demo.controllers;

import com.example.demo.exeptions.CustomException;
import com.example.demo.models.BookingModel;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody BookingModel booking) {

        if (bookingService.existsById(booking.getId())){
            throw new CustomException("Booking already exists", HttpStatus.BAD_REQUEST);

//            return new ResponseEntity(new RuntimeException("Booking already exists").getMessage() ,HttpStatus.CONFLICT);
        }
        return new ResponseEntity(bookingService.save(booking), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody BookingModel booking) {

        if (!bookingService.existsById(booking.getId())){
            throw new CustomException("Booking not found", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(bookingService.save(booking), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity findById(@PathVariable long id) {

        if (!bookingService.existsById(id)){
            throw new CustomException("Booking not found", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(bookingService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity getAll() {
        return new ResponseEntity(bookingService.getAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id) {
        if (!bookingService.existsById(id)){
            throw new CustomException("Booking not found", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(bookingService.delete(id), HttpStatus.OK);
    }
}
