package com.example.demo.models;

import com.example.demo.entity.BookingEntity;
import com.example.demo.entity.FlightEntity;

import java.util.List;

public class FlightModel {
    private Long flightCode;
    private AirportModel source;
    private AirportModel destination;
    private String time;
    private String date;
    private String amountOfPassengers;
    private String pilotName;
    private String airlineName;
    private String airplaneNumber;
    private List<BookingEntity> bookings;


    public FlightModel(Long flightCode, AirportModel source, AirportModel destination, String time, String date, String amountOfPassengers, String pilotName, String airlineName, String airplaneNumber) {
        this.flightCode = flightCode;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.date = date;
        this.amountOfPassengers = amountOfPassengers;
        this.pilotName = pilotName;
        this.airlineName = airlineName;
        this.airplaneNumber = airplaneNumber;
    }

    public FlightModel(Long flightCode, AirportModel source, AirportModel destination, String time, String date, String amountOfPassengers, String pilotName, String airlineName, String airplaneNumber, List<BookingEntity> bookings) {
        this.flightCode = flightCode;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.date = date;
        this.amountOfPassengers = amountOfPassengers;
        this.pilotName = pilotName;
        this.airlineName = airlineName;
        this.airplaneNumber = airplaneNumber;
        this.bookings = bookings;
    }

    public void setFlightCode(Long flightCode) {
        this.flightCode = flightCode;
    }

    public void setSource(AirportModel source) {
        this.source = source;
    }

    public void setDestination(AirportModel destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(String amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(String airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }


    public AirportModel getDestination() {
        return destination;
    }

    public AirportModel getSource() {
        return source;
    }

    public Long getFlightCode() {
        return flightCode;
    }

    public List<BookingEntity> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingEntity> bookings) {
        this.bookings = bookings;
    }
    public FlightEntity toEntity(){
        return new FlightEntity(this.flightCode, this.time, this.date, this.amountOfPassengers, this.pilotName, this.airlineName, this.airplaneNumber, this.source.toEntity(), this.destination.toEntity(), this.bookings);
    }
}
