package com.example.demo.models;

import com.example.demo.entity.BookingEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.util.BookingType;
import jakarta.persistence.*;

public class BookingModel {
    private long id;
    private String seat;
    //enum
    private BookingType type;
    //relationship
    private UserEntity user;
    //relationship
    private FlightEntity flight;

    public BookingModel() {}

    public BookingModel(long id, String seat, BookingType type, UserEntity user, FlightEntity flight) {
        this.id = id;
        this.seat = seat;
        this.type = type;
        this.user = user;
        this.flight = flight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public BookingType getType() {
        return type;
    }

    public void setType(BookingType type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public FlightEntity getFlight() {
        return flight;
    }

    public void setFlight(FlightEntity flight) {
        this.flight = flight;
    }

    public BookingEntity toEntity(){
        return new BookingEntity(this.id, this.seat, this.type, this.user, this.flight);
    }



}
