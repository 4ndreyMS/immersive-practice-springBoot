package com.example.demo.entity;

import com.example.demo.models.AirportModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "airport")
public class AirportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String country;
    private String location;
    @ElementCollection
    private List<String> gates;
    //relationship
    @OneToMany(mappedBy = "source")
    private List<FlightEntity> sourceFlights;
    //relationship
    @OneToMany(mappedBy = "destination")
    private List<FlightEntity> destinationFlights;

    public AirportEntity(Long id, String city, String country, String location, List<String> gates) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.location = location;
        this.gates = gates;
    }

    public AirportEntity() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getGates() {
        return gates;
    }

    public void setGates(List<String> gates) {
        this.gates = gates;
    }

    public AirportModel toAirportModel() {
        return  new AirportModel(this.id, this.city, this.country, this.location, this.gates);
    }
}
