package com.example.demo.service;


import com.example.demo.models.BookingModel;
import com.example.demo.models.FlightModel;
import com.example.demo.repositories.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    @Autowired
    public BookingsRepository bookingsRepository;

    public BookingService() {
    }

    public List<BookingModel> getAll() {
        List<BookingModel> bookings = new ArrayList<>();
        bookingsRepository.findAll().forEach(booking -> bookings.add(booking.toModel()));
        return bookings;
    }

    public BookingModel save(BookingModel booking) {
        return bookingsRepository.save(booking.toEntity()).toModel();
    }

    public boolean delete(long id) {
        try{
            bookingsRepository.deleteById(id);
            return true;

        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public BookingModel getById(Long id) {
        return bookingsRepository.findById(id).get().toModel();
    }

    public boolean existsById(Long id) {
        return bookingsRepository.existsById(id);
    }
}
