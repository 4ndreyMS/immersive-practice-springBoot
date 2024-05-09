package com.example.demo.entity;

import com.example.demo.models.FlightModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "flight")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightCode;
    private String time;
    private String date;
    private String amountOfPassengers;
    private String pilotName;
    private String airlineName;
    private String airplaneNumber;
    //relatationship
    @ManyToOne
    @JoinColumn(name = "source_id")
    private AirportEntity source;
    //relatationship
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private AirportEntity destination;
    //relatationship
    @OneToMany(mappedBy = "flight")
    private List<BookingEntity> bookings;

    public FlightEntity() {
    }

    public FlightEntity(Long id, String time, String date, String amountOfPassengers, String pilotName, String airlineName, String airplaneNumber, AirportEntity source, AirportEntity destination) {
        this.flightCode = id;
        this.time = time;
        this.date = date;
        this.amountOfPassengers = amountOfPassengers;
        this.pilotName = pilotName;
        this.airlineName = airlineName;
        this.airplaneNumber = airplaneNumber;
        this.source = source;
        this.destination = destination;
    }

    public FlightEntity(Long flightCode, String time, String date, String amountOfPassengers, String pilotName, String airlineName, String airplaneNumber, AirportEntity source, AirportEntity destination, List<BookingEntity> bookings) {
        this.flightCode = flightCode;
        this.time = time;
        this.date = date;
        this.amountOfPassengers = amountOfPassengers;
        this.pilotName = pilotName;
        this.airlineName = airlineName;
        this.airplaneNumber = airplaneNumber;
        this.source = source;
        this.destination = destination;
        this.bookings = bookings;
    }

    public void setFlightCode(Long id) {
        this.flightCode = id;
    }

    public Long getFlightCode() {
        return flightCode;
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

    public AirportEntity getSource() {
        return source;
    }

    public void setSource(AirportEntity source) {
        this.source = source;
    }

    public AirportEntity getDestination() {
        return destination;
    }

    public void setDestination(AirportEntity destination) {
        this.destination = destination;
    }

//  todo: show relation list  make this
    public FlightModel toModel(){
        return new FlightModel(this.flightCode, this.source.toAirportModel(), this.destination.toAirportModel(), this.time, this.date, this.amountOfPassengers, this.pilotName, this.airlineName, this.airplaneNumber, this.bookings);
    }

}
